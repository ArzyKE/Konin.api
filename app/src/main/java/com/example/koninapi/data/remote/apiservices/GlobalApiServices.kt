package com.example.koninapi.data.remote.apiservices

import com.example.koninapi.models.GlobalModel
import retrofit2.http.GET

interface GlobalApiServices {
    @GET("global")
    suspend fun fetchGlobal(): GlobalModel
}