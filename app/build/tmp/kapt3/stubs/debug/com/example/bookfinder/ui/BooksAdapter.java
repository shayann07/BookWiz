package com.example.bookfinder.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/bookfinder/ui/BooksAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/bookfinder/data/model/VolumeItem;", "Lcom/example/bookfinder/ui/BooksAdapter$BookVH;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookVH", "Companion", "app_debug"})
public final class BooksAdapter extends androidx.paging.PagingDataAdapter<com.example.bookfinder.data.model.VolumeItem, com.example.bookfinder.ui.BooksAdapter.BookVH> {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bookfinder.data.model.VolumeItem> DIFF = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bookfinder.ui.BooksAdapter.Companion Companion = null;
    
    public BooksAdapter() {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.bookfinder.ui.BooksAdapter.BookVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bookfinder.ui.BooksAdapter.BookVH holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bookfinder/ui/BooksAdapter$BookVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bind", "Lcom/example/bookfinder/databinding/ItemBookBinding;", "(Lcom/example/bookfinder/ui/BooksAdapter;Lcom/example/bookfinder/databinding/ItemBookBinding;)V", "getBind", "()Lcom/example/bookfinder/databinding/ItemBookBinding;", "app_debug"})
    public final class BookVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.bookfinder.databinding.ItemBookBinding bind = null;
        
        public BookVH(@org.jetbrains.annotations.NotNull()
        com.example.bookfinder.databinding.ItemBookBinding bind) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.bookfinder.databinding.ItemBookBinding getBind() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/bookfinder/ui/BooksAdapter$Companion;", "", "()V", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/bookfinder/data/model/VolumeItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}