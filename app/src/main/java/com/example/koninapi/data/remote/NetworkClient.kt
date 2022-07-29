package com.example.koninapi.data.remote

import com.example.koninapi.data.remote.apiservices.CoinsApiServices
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttpClient: OkHttp
) {

    private val provideRetrofit = retrofitClient.provideRetrofit(okHttpClient.provideOkHttpClient())

    fun provideCoinsApiService() = provideRetrofit.create(CoinsApiServices::class.java)
}

