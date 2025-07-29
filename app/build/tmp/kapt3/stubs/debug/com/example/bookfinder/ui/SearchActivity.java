package com.example.bookfinder.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/example/bookfinder/ui/SearchActivity;", "Landroidx/activity/ComponentActivity;", "()V", "adapter", "Lcom/example/bookfinder/ui/BooksAdapter;", "binding", "Lcom/example/bookfinder/databinding/ActivitySearchBinding;", "flowJob", "Lkotlinx/coroutines/Job;", "searchJob", "vm", "Lcom/example/bookfinder/ui/MainViewModel;", "getVm", "()Lcom/example/bookfinder/ui/MainViewModel;", "vm$delegate", "Lkotlin/Lazy;", "collectFlow", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/bookfinder/data/model/VolumeItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SearchActivity extends androidx.activity.ComponentActivity {
    private com.example.bookfinder.databinding.ActivitySearchBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.bookfinder.ui.BooksAdapter adapter = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job flowJob;
    
    public SearchActivity() {
        super(0);
    }
    
    private final com.example.bookfinder.ui.MainViewModel getVm() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void collectFlow(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> flow) {
    }
}