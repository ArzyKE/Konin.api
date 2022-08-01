package com.example.koninapi.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.koninapi.databinding.ItemTagsBinding
import com.example.koninapi.models.TagsModel

class TagsAdapter : ListAdapter<TagsModel, TagsAdapter.ViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagsAdapter.ViewHolder {
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

        fun onBind(item: TagsModel?) {
            binding.itemTagsName.text = item?.name
        }
    }

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<TagsModel> =
            object : DiffUtil.ItemCallback<TagsModel>() {
                override fun areItemsTheSame(
                    oldItem: TagsModel,
                    newItem: TagsModel
                ): Boolean {
                    return oldItem.id === newItem.id
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: TagsModel,
                    newItem: TagsModel
                ): Boolean {
                    return oldItem === newItem
                }
            }
    }
}