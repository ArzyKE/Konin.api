package com.example.koninapi.domain.repositories

import com.example.koninapi.domain.either.Either
import com.example.koninapi.domain.models.CoinModel
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    fun fetchCoins() : Flow<Either<String, List<CoinModel>>>
}