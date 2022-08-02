package com.example.koninapi.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class PeopleDto(
    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("id")
    val id: String,

    @SerializedName("teams_count")
    val teamsCount: Int = 0
)