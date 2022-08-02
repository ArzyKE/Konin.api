package com.example.koninapi.presentation.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.koninapi.databinding.ItemTagsBinding
import com.example.koninapi.data.remote.dtos.TagsDto

class TagsAdapter : ListAdapter<TagsDto, TagsAdapter.ViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemTagsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemTagsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: TagsDto?) {
            binding.itemTagsName.text = item?.name
        }
    }

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<TagsDto> =
            object : DiffUtil.ItemCallback<TagsDto>() {
                override fun areItemsTheSame(
                    oldItem: TagsDto,
                    newItem: TagsDto
                ): Boolean {
                    return oldItem.id === newItem.id
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: TagsDto,
                    newItem: TagsDto
                ): Boolean {
                    return oldItem === newItem
                }
            }
    }
}