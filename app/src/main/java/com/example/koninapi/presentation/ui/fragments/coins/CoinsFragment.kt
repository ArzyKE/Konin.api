package com.example.koninapi.presentation.ui.fragments.coins

import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.koninapi.R
import com.example.koninapi.databinding.FragmentCoinsBinding
import com.example.koninapi.presentation.base.BaseFragment
import com.example.koninapi.presentation.ui.adapters.CoinsAdapter
import com.example.koninapi.presentation.ui.state.UIState
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
        viewModel.coinState.observe(viewLifecycleOwner) {
            when (it) {
                is UIState.Error -> {
                    Log.e("son", it.error)
                }
                is UIState.Success -> {
                    binding.miProgress.visibility = View.GONE
                    coinsadapter.submitList(it.data)
                }
                else -> {}
            }
        }
    }
}
