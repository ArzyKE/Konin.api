package com.example.koninapi.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.koninapi.databinding.ItemCoinsBinding
import com.example.koninapi.models.CoinsModel

class CoinsAdapter
    : ListAdapter<CoinsModel, CoinsAdapter.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinsAdapter.ViewHolder {
        return ViewHolder(
            ItemCoinsBinding.inflate(
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
        private val binding: ItemCoinsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: CoinsModel?) {
            binding.itemCoinsName.text = item?.name
        }
    }

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<CoinsModel> =
            object : DiffUtil.ItemCallback<CoinsModel>() {
                override fun areItemsTheSame(
                    oldItem: CoinsModel,
                    newItem: CoinsModel
                ): Boolean {
                    return oldItem.id === newItem.id
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: CoinsModel,
                    newItem: CoinsModel
                ): Boolean {
                    return oldItem === newItem
                }

            }
    }
}

