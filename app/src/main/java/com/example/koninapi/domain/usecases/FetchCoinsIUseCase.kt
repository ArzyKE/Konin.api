package com.example.koninapi.domain.usecases

import com.example.koninapi.domain.repositories.CoinRepository
import javax.inject.Inject

class FetchCoinsIUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke() = repository.fetchCoins()

}

