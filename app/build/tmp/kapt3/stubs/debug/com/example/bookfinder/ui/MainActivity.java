package com.example.bookfinder.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/example/bookfinder/ui/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "adapter", "Lcom/example/bookfinder/ui/BooksAdapter;", "getAdapter", "()Lcom/example/bookfinder/ui/BooksAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/example/bookfinder/databinding/ActivityMainBinding;", "flowJob", "Lkotlinx/coroutines/Job;", "searchJob", "vm", "Lcom/example/bookfinder/ui/MainViewModel;", "getVm", "()Lcom/example/bookfinder/ui/MainViewModel;", "vm$delegate", "collectFlow", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/bookfinder/data/model/VolumeItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "dpToPx", "", "Landroid/content/Context;", "dp", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    private com.example.bookfinder.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vm$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job flowJob;
    
    public MainActivity() {
        super(0);
    }
    
    private final com.example.bookfinder.ui.MainViewModel getVm() {
        return null;
    }
    
    private final com.example.bookfinder.ui.BooksAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void collectFlow(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.bookfinder.data.model.VolumeItem>> flow) {
    }
    
    /**
     * dp → px helper
     */
    private final int dpToPx(android.content.Context $this$dpToPx, int dp) {
        return 0;
    }
}