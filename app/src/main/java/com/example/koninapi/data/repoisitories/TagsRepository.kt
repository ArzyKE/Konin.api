package com.example.koninapi.data.repoisitories

import com.example.koninapi.data.remote.apiservices.TagsApiServices
import javax.inject.Inject

class TagsRepository @Inject constructor(private val apiServices: TagsApiServices) :
    BaseRepository() {

    fun fetchTags() = doRequest { apiServices.fetchTags() }


}