package com.example.data.repoisitories

import com.example.data.repoisitories.BaseRepository
import com.example.koninapi.data.remote.apiservices.PeopleApiServices
import javax.inject.Inject

class PeopleRepository @Inject constructor(private val apiServices: PeopleApiServices) :
    BaseRepository() {

    fun fetchPeople(id: Int) = doRequest { apiServices.fetchPeople(id) }


}