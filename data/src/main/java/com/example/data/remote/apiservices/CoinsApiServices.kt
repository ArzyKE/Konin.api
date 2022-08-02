package com.example.koninapi.data.remote.apiservices

import com.example.data.remote.dtos.CoinDto
import retrofit2.http.GET

interface CoinsApiServices {

    @GET("coins")
    suspend fun fetchCoins(): List<CoinDto>
}