package com.example.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class TagsDto(
    @SerializedName("coin_counter")
    val coinCounter: Int = 0,

    @SerializedName("ico_counter")
    val icoCounter: Int = 0,

    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("id")
    val id: String,

    @SerializedName("type")
    val type: String,
)