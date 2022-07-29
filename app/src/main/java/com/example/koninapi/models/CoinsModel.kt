package com.example.koninapi.models

import com.google.gson.annotations.SerializedName

data class CoinsModel(
    @SerializedName("symbol")
    val symbol: String,

    @SerializedName("is_active")
    val isActive: Boolean,

    @SerializedName("is_new")
    val isNew: Boolean,

    @SerializedName("name")
    val name: String,

    @SerializedName("rank")
    val rank: Int,

    @SerializedName("id")
    val id: String,

    @SerializedName("type")
    val type: String
)