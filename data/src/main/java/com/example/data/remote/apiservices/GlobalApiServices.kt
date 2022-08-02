package com.example.koninapi.data.remote.apiservices

import com.example.data.remote.dtos.GlobalDto
import retrofit2.http.GET

interface GlobalApiServices {
    @GET("global")
    suspend fun fetchGlobal(): GlobalDto
}