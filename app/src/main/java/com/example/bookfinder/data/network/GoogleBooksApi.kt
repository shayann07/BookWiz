package com.example.bookfinder.data.network

import com.example.bookfinder.data.model.VolumeResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GoogleBooksApi {
    @GET("volumes")
    suspend fun searchVolumes(
        @Query("q") query: String,
        @Query("startIndex") start: Int,
        @Query("maxResults") size: Int = 20,
        @Query("printType") printType: String = "books"
    ): VolumeResponse
}