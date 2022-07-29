package com.example.koninapi.data.remote.apiservices

import com.example.koninapi.models.CoinsModel
import retrofit2.http.GET

interface CoinsApiServices {

    @GET("coins")
    suspend fun fetchCoins(): List<CoinsModel>
}