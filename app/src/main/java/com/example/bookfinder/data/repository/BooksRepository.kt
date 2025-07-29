package com.example.bookfinder.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.bookfinder.data.model.VolumeItem
import com.example.bookfinder.data.network.GoogleBooksApi
import com.example.bookfinder.data.network.RetrofitModule
import kotlinx.coroutines.flow.Flow

class BooksRepository(
    private val api: GoogleBooksApi = RetrofitModule.api
) {

    /** Featured (home) feed */
    fun featuredPager(): Flow<PagingData<VolumeItem>> = Pager(
        config = PagingConfig(pageSize = 20, enablePlaceholders = false),
        pagingSourceFactory = { BooksPagingSource(api, "bestsellers") }).flow

    /** Arbitrary user search */
    fun searchPager(query: String): Flow<PagingData<VolumeItem>> = Pager(
        config = PagingConfig(pageSize = 20, enablePlaceholders = false),
        pagingSourceFactory = { BooksPagingSource(api, query) }).flow

    /* ─────────────── PagingSource ─────────────── */
    private class BooksPagingSource(
        private val api: GoogleBooksApi, private val query: String
    ) : PagingSource<Int, VolumeItem>() {

        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, VolumeItem> {
            val start = params.key ?: 0
            val requestedSz = params.loadSize.coerceAtMost(40)  // ← clamp here
            try {
                val resp = api.searchVolumes(query, start, requestedSz)
                return LoadResult.Page(
                    data = resp.items,
                    prevKey = if (start == 0) null else maxOf(start - requestedSz, 0),
                    nextKey = if (resp.items.isEmpty()) null else start + requestedSz
                )
            } catch (e: Exception) {
                return LoadResult.Error(e)
            }
        }

        override fun getRefreshKey(state: PagingState<Int, VolumeItem>): Int? {
            val anchorPos = state.anchorPosition ?: return null
            val closestPage = state.closestPageToPosition(anchorPos) ?: return null

            // Jump forward or back by one page-size, if possible
            return closestPage.prevKey?.plus(state.config.pageSize)
                ?: closestPage.nextKey?.minus(state.config.pageSize)
        }
    }
}