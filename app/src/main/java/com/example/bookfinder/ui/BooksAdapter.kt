package com.example.bookfinder.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.text.bold
import androidx.core.text.buildSpannedString
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.bookfinder.R
import com.example.bookfinder.data.model.VolumeItem
import com.example.bookfinder.databinding.ItemBookBinding

class BooksAdapter : PagingDataAdapter<VolumeItem, BooksAdapter.BookVH>(DIFF) {

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<VolumeItem>() {
            override fun areItemsTheSame(old: VolumeItem, new: VolumeItem) = old.id == new.id
            override fun areContentsTheSame(old: VolumeItem, new: VolumeItem) = old == new
        }
    }

    inner class BookVH(val bind: ItemBookBinding) : RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookVH =
        BookVH(ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: BookVH, position: Int) {
        val item = getItem(position) ?: return
        with(holder.bind) {
            imgCover.load(item.volumeInfo.imageLinks?.thumbnail?.replace("http://", "https://")) {
                crossfade(true)
                placeholder(R.drawable.ic_placeholder)
                transformations(coil.transform.RoundedCornersTransformation(12f))
            }

            tvTitle.text = item.volumeInfo.title

            //  ➜ “By:” bold, author normal
            tvAuthor.text = buildSpannedString {
                bold { append("By: ") }
                append(item.volumeInfo.authorLabel)
            }
        }
    }
}
