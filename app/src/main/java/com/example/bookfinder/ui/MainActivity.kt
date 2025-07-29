package com.example.bookfinder.ui

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import androidx.paging.PagingData
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookfinder.data.model.VolumeItem
import com.example.bookfinder.databinding.ActivityMainBinding
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val vm: MainViewModel by viewModels { ViewModelFactory() }

    private val adapter by lazy { BooksAdapter() }
    private var searchJob: Job? = null
    private var flowJob: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ──────────── RecyclerView + spacing ────────────
        val spanCount = 2
        val spacingDp = dpToPx(8)
        binding.rvFeatured.apply {
            layoutManager = GridLayoutManager(this@MainActivity, spanCount)
            adapter       = this@MainActivity.adapter
            setHasFixedSize(true)
            addItemDecoration(GridSpacingItemDecoration(spanCount, spacingDp, includeEdge = true))
        }

        // ──────────── First load = featured list ────────────
        collectFlow(vm.featured)

        // ──────────── Pull-to-refresh ────────────
        binding.swipeRefresh.setOnRefreshListener { adapter.refresh() }
        adapter.addLoadStateListener { state ->
            binding.swipeRefresh.isRefreshing =
                state.refresh is androidx.paging.LoadState.Loading
        }

        // ──────────── Debounced inline search ────────────
        binding.etSearchMain.doAfterTextChanged { text ->
            searchJob?.cancel()
            searchJob = lifecycleScope.launch {
                delay(350)
                val q = text?.toString()?.trim().orEmpty()
                if (q.isNotBlank()) {
                    collectFlow(vm.search(q))
                } else {
                    collectFlow(vm.featured)
                }
            }
        }
    }

    private fun collectFlow(flow: Flow<PagingData<VolumeItem>>) {
        flowJob?.cancel()
        flowJob = lifecycleScope.launchWhenStarted {
            flow.collectLatest { adapter.submitData(it) }
        }
    }

    /** dp → px helper */
    private fun Context.dpToPx(dp: Int): Int =
        (dp * resources.displayMetrics.density).toInt()
}
