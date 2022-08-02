package com.example.koninapi.data.remote.apiservices

import com.example.koninapi.data.remote.dtos.TagsDto
import retrofit2.http.GET

interface TagsApiServices {
    @GET("tags")
    suspend fun fetchTags(): List<TagsDto>
}