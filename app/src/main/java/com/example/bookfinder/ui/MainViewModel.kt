package com.example.bookfinder.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.bookfinder.data.model.VolumeItem
import com.example.bookfinder.data.repository.BooksRepository
import kotlinx.coroutines.flow.Flow

class MainViewModel(
    private val repo: BooksRepository
) : ViewModel() {

    /** Home-screen featured list (cached) */
    val featured: Flow<PagingData<VolumeItem>> =
        repo.featuredPager().cachedIn(viewModelScope)

    /** New search flow (also cached) */
    fun search(query: String): Flow<PagingData<VolumeItem>> =
        repo.searchPager(query).cachedIn(viewModelScope)
}
