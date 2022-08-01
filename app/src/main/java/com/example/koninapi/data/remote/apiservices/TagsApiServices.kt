package com.example.koninapi.data.remote.apiservices

import com.example.koninapi.models.TagsModel
import retrofit2.http.GET

interface TagsApiServices {
    @GET("tags")
    suspend fun fetchTags(): List<TagsModel>
}