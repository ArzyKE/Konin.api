package com.example.koninapi.presentation.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.koninapi.databinding.ItemCoinsBinding
import com.example.koninapi.presentation.ui.models.CoinModelUI

class CoinsAdapter
    : ListAdapter<CoinModelUI, CoinsAdapter.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
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

        fun onBind(item: CoinModelUI?) {
            binding.itemCoinsName.text = item?.name
        }
    }

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<CoinModelUI> =
            object : DiffUtil.ItemCallback<CoinModelUI>() {
                override fun areItemsTheSame(
                    oldItem: CoinModelUI,
                    newItem: CoinModelUI
                ): Boolean {
                    return oldItem.id === newItem.id
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: CoinModelUI,
                    newItem: CoinModelUI
                ): Boolean {
                    return oldItem === newItem
                }

            }
    }
}

