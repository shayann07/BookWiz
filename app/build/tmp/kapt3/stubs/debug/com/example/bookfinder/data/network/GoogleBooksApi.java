package com.example.bookfinder.data.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/bookfinder/data/network/GoogleBooksApi;", "", "searchVolumes", "Lcom/example/bookfinder/data/model/VolumeResponse;", "query", "", "start", "", "size", "printType", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GoogleBooksApi {
    
    @retrofit2.http.GET(value = "volumes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchVolumes(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query, @retrofit2.http.Query(value = "startIndex")
    int start, @retrofit2.http.Query(value = "maxResults")
    int size, @retrofit2.http.Query(value = "printType")
    @org.jetbrains.annotations.NotNull()
    java.lang.String printType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bookfinder.data.model.VolumeResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}