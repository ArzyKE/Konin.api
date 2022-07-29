package com.example.koninapi.di

import com.example.koninapi.data.remote.NetworkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideCoinsApiService(netWorkClient: NetworkClient) =
        netWorkClient.provideCoinsApiService()

    @Singleton
    @Provides
    fun provideGlobalApiService(netWorkClient: NetworkClient) =
        netWorkClient.provideGlobalApiService()
}