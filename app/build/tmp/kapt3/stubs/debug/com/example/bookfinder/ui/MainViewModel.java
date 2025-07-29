package com.example.bookfinder.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/bookfinder/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/bookfinder/data/repository/BooksRepository;", "(Lcom/example/bookfinder/data/repository/BooksRepository;)V", "featured", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/bookfinder/data/model/VolumeItem;", "getFeatured", "()Lkotlinx/coroutines/flow/Flow;", "search", "query", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.bookfinder.data.repository.BooksRepository repo = null;
    
    /**
     * Home-screen featured list (cached)
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> featured = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bookfinder.data.repository.BooksRepository repo) {
        super();
    }
    
    /**
     * Home-screen featured list (cached)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> getFeatured() {
        return null;
    }
    
    /**
     * New search flow (also cached)
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}