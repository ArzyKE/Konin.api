package com.example.koninapi.presentation.ui.fragments.global

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.koninapi.R
import com.example.koninapi.presentation.base.BaseFragment
import com.example.koninapi.databinding.FragmentGlobalBinding
import com.example.koninapi.domain.either.Either
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GlobalFragment
    : BaseFragment<GlobalViewModel, FragmentGlobalBinding>(R.layout.fragment_global) {

    override val binding by viewBinding(FragmentGlobalBinding::bind)
    override val viewModel: GlobalViewModel by viewModels()

    override fun setupSubscribes() {
        setupObserves()
    }

    private fun setupObserves() {
        viewModel.fetchGlobal().observe(viewLifecycleOwner) {
            when (it) {
                is Either.Left -> {
                    Log.e("anime", it.value)
                }
                is Either.Right -> {
                    Log.e("Arzymat", it.value.toString())
                    it.value.apply {
                        binding.itemGlobal.text = volumeHAthDate
                    }
                }
            }
        }
    }
}