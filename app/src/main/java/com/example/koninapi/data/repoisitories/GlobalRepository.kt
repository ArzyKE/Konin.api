package com.example.koninapi.data.repoisitories

import com.example.koninapi.data.remote.apiservices.GlobalApiServices
import javax.inject.Inject

class GlobalRepository @Inject constructor(private val apiServices: GlobalApiServices) :
    BaseRepository() {

    fun fetchGlobal() = doRequest { apiServices.fetchGlobal() }
}