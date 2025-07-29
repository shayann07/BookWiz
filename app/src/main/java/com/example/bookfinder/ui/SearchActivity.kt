package com.example.bookfinder.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bookfinder.databinding.ActivitySearchBinding
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class SearchActivity : ComponentActivity() {

    private lateinit var binding: ActivitySearchBinding
    private val vm: MainViewModel by viewModels { ViewModelFactory() }

    private val adapter = BooksAdapter()
    private var searchJob: Job? = null
    private var flowJob: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvResults.apply {
            layoutManager = LinearLayoutManager(this@SearchActivity)
            adapter = this@SearchActivity.adapter
        }

        binding.toolbar.setNavigationOnClickListener { finish() }

        fun updateEmptyState() {
            binding.emptyState.visibility =
                if (adapter.itemCount == 0) android.view.View.VISIBLE
                else android.view.View.GONE
        }

        /* Live search with debounce */
        binding.etSearch.doAfterTextChanged { text ->
            searchJob?.cancel()
            searchJob = lifecycleScope.launch {
                delay(350)
                val q = text?.toString()?.trim().orEmpty()
                if (q.isNotBlank()) {
                    binding.progress.show()
                    collectFlow(vm.search(q))
                }
            }
        }

        /* Keep empty-state accurate as pages load */
        adapter.addLoadStateListener { updateEmptyState() }
    }

    private fun collectFlow(flow: kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>>) {
        flowJob?.cancel()
        flowJob = lifecycleScope.launchWhenStarted {
            flow.collectLatest {
                binding.progress.hide()
                adapter.submitData(it)
            }
        }
    }
}
