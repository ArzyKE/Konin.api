package com.example.koninapi.data.remote.apiservices

import com.example.data.remote.dtos.PeopleDto
import retrofit2.http.GET
import retrofit2.http.Path

interface PeopleApiServices {

    @GET("people/{person_id}")
    suspend fun fetchPeople(
        @Path("person_id") id: Int
    ): PeopleDto
}