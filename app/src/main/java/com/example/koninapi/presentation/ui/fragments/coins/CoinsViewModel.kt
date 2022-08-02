package com.example.koninapi.presentation.ui.fragments.coins

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.usecases.FetchCoinsIUseCase
import com.example.koninapi.presentation.base.BaseViewModel
import com.example.koninapi.presentation.ui.models.CoinModelUI
import com.example.koninapi.presentation.ui.models.toUI
import com.example.koninapi.presentation.ui.state.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinsViewModel @Inject constructor(private val fetchCoinsIUseCase: FetchCoinsIUseCase) :
    BaseViewModel() {

    private val _coinState = MutableLiveData<UIState<List<CoinModelUI>>>()
    val coinState: LiveData<UIState<List<CoinModelUI>>> = _coinState

    init {
        fetchCoins()
    }


    private fun fetchCoins() {
        fetchCoinsIUseCase().collectRequest(_coinState) {
            it.map { it.toUI() }
        }
    }
}