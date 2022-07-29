package com.example.koninapi.ui.fragments.coins

import com.example.koninapi.base.BaseViewModel
import com.example.koninapi.data.repoisitories.CoinsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinsViewModel @Inject constructor(private val repository: CoinsRepository) :
    BaseViewModel() {

    fun fetchCoins() = repository.fetchCoins()
}