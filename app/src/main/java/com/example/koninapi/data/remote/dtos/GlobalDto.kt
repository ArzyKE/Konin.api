package com.example.koninapi.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class GlobalDto(
    @SerializedName("market_cap_ath_value")
    val marketCapAthValue: Long = 0,

    @SerializedName("bitcoin_dominance_percentage")
    val bitcoinDominancePercentage: Double = 0.0,

    @SerializedName("last_updated")
    val lastUpdated: Int = 0,

    @SerializedName("volume_24h_ath_date")
    val volumeHAthDate: String,

    @SerializedName("volume_24h_change_24h")
    val volumeHChangeH: Double = 0.0,

    @SerializedName("volume_24h_ath_value")
    val volumeHAthValue: Long = 0,

    @SerializedName("volume_24h_usd")
    val volumeHUsd: Long = 0,

    @SerializedName("cryptocurrencies_number")
    val cryptocurrenciesNumber: Int = 0,

    @SerializedName("market_cap_usd")
    val marketCapUsd: Long = 0,

    @SerializedName("market_cap_ath_date")
    val marketCapAthDate: String,

    @SerializedName("market_cap_change_24h")
    val marketCapChangeH: Double = 0.0
)