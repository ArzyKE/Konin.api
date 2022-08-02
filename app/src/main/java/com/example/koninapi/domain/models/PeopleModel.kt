package com.example.koninapi.domain.models


data class PeopleModel(
    val name: String,

    val description: String,

    val id: String,

    val teamsCount: Int = 0
)