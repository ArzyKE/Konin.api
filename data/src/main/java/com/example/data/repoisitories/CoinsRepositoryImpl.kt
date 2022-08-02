package com.example.data.repoisitories

import com.example.koninapi.data.remote.apiservices.CoinsApiServices
import com.example.data.remote.dtos.toDomain
import com.example.domain.either.Either
import com.example.domain.models.CoinModel
import com.example.domain.repositories.CoinRepository
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