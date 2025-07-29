package com.example.bookfinder.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/bookfinder/data/repository/BooksRepository;", "", "api", "Lcom/example/bookfinder/data/network/GoogleBooksApi;", "(Lcom/example/bookfinder/data/network/GoogleBooksApi;)V", "featuredPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/bookfinder/data/model/VolumeItem;", "searchPager", "query", "", "BooksPagingSource", "app_debug"})
public final class BooksRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.bookfinder.data.network.GoogleBooksApi api = null;
    
    public BooksRepository(@org.jetbrains.annotations.NotNull()
    com.example.bookfinder.data.network.GoogleBooksApi api) {
        super();
    }
    
    /**
     * Featured (home) feed
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> featuredPager() {
        return null;
    }
    
    /**
     * Arbitrary user search
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> searchPager(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public BooksRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bookfinder/data/repository/BooksRepository$BooksPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/bookfinder/data/model/VolumeItem;", "api", "Lcom/example/bookfinder/data/network/GoogleBooksApi;", "query", "", "(Lcom/example/bookfinder/data/network/GoogleBooksApi;Ljava/lang/String;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    static final class BooksPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.bookfinder.data.model.VolumeItem> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.bookfinder.data.network.GoogleBooksApi api = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String query = null;
        
        public BooksPagingSource(@org.jetbrains.annotations.NotNull()
        com.example.bookfinder.data.network.GoogleBooksApi api, @org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Object load(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.bookfinder.data.model.VolumeItem>> $completion) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingState<java.lang.Integer, com.example.bookfinder.data.model.VolumeItem> state) {
            return null;
        }
    }
}