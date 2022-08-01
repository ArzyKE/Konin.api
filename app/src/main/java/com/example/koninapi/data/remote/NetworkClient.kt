package com.example.koninapi.data.remote

import com.example.koninapi.data.remote.apiservices.CoinsApiServices
import com.example.koninapi.data.remote.apiservices.GlobalApiServices
import com.example.koninapi.data.remote.apiservices.PeopleApiServices
import com.example.koninapi.data.remote.apiservices.TagsApiServices
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: RetrofitClient,
    okHttpClient: OkHttp
) {

    private val provideRetrofit = retrofitClient.provideRetrofit(okHttpClient.provideOkHttpClient())

    fun provideCoinsApiService() = provideRetrofit.create(CoinsApiServices::class.java)
    fun provideGlobalApiService() = provideRetrofit.create(GlobalApiServices::class.java)
    fun providePeopleApiService() = provideRetrofit.create(PeopleApiServices::class.java)
    fun provideTagsApiService() = provideRetrofit.create(TagsApiServices::class.java)
}

