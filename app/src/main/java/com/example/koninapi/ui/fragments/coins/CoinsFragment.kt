package com.example.koninapi.ui.fragments.coins

import android.opengl.Visibility
import android.util.Log
import android.widget.ProgressBar
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.koninapi.R
import com.example.koninapi.base.BaseFragment
import com.example.koninapi.databinding.FragmentCoinsBinding
import com.example.koninapi.ui.adapters.CoinsAdapter
import com.example.koninapi.utils.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoinsFragment
    : BaseFragment<CoinsViewModel, FragmentCoinsBinding>(R.layout.fragment_coins) {

    override val binding by viewBinding(FragmentCoinsBinding::bind)
    override val viewModel: CoinsViewModel by viewModels()
    private val coinsadapter = CoinsAdapter()

    override fun iniatalize() {
        setupRecyclerview()
    }

    private fun setupRecyclerview() = with(binding.recyclerViewCoins) {
        layoutManager = LinearLayoutManager(requireContext())
        adapter = coinsadapter
    }

    override fun setupSubscribes() {
        setupObserver()
    }

    private fun setupObserver() {
        viewModel.fetchCoins().observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("anime", it.value)
                }
                is Either.Right -> {
                    Log.e("Kadyrov", it.value.toString())
                    coinsadapter.submitList(it.value)
                }
            }
        }
    }
}