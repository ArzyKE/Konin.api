package com.example.koninapi.data.repoisitories

import com.example.koninapi.data.remote.apiservices.CoinsApiServices
import com.example.koninapi.data.remote.dtos.toDomain
import com.example.koninapi.domain.either.Either
import com.example.koninapi.domain.models.CoinModel
import com.example.koninapi.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CoinsRepositoryImpl @Inject constructor(private val apiServices: CoinsApiServices) :
    BaseRepository(), CoinRepository {

    override fun fetchCoins(): Flow<Either<String, List<CoinModel>>> = doRequest {
        apiServices.fetchCoins().map {
            it.toDomain()
        }
    }
}