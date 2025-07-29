package com.example.bookfinder.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VolumeResponse(
    val items: List<VolumeItem> = emptyList()
)

@JsonClass(generateAdapter = true)
data class VolumeItem(
    val id: String,
    val volumeInfo: VolumeInfo
)

@JsonClass(generateAdapter = true)
data class VolumeInfo(
    val title: String = "—",
    val authors: List<String>? = null,
    val description: String? = null,
    val imageLinks: ImageLinks? = null
) {
    val authorLabel: String
        get() = authors?.joinToString() ?: "Unknown"
}

@JsonClass(generateAdapter = true)
data class ImageLinks(
    val thumbnail: String? = null,
    val smallThumbnail: String? = null
)