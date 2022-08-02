package com.example.koninapi.domain.models

data class GlobalModel(
    val marketCapAthValue: Long = 0,

    val bitcoinDominancePercentage: Double = 0.0,

    val lastUpdated: Int = 0,

    val volumeHAthDate: String,

    val volumeHChangeH: Double = 0.0,

    val volumeHAthValue: Long = 0,

    val volumeHUsd: Long = 0,

    val cryptocurrenciesNumber: Int = 0,

    val marketCapUsd: Long = 0,

    val marketCapAthDate: String,

    val marketCapChangeH: Double = 0.0
)