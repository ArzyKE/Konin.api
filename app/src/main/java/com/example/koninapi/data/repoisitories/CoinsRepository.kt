package com.example.koninapi.data.repoisitories

import com.example.koninapi.data.remote.apiservices.CoinsApiServices
import javax.inject.Inject

class CoinsRepository @Inject constructor(private val apiServices: CoinsApiServices) :
    BaseRepository() {

    fun fetchCoins() = doRequest { apiServices.fetchCoins() }
}