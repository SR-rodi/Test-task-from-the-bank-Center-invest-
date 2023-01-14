package com.example.spaceX.feature_spase.data.query.childe.options

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Select(
    @SerializedName("name")
    val name: Int = 1,
    @SerializedName("success")
    val success: Int = 1,
    @SerializedName("details")
    val details: Int = 1,
    @SerializedName("date_unix")
    val dateUnix: Int = 1,
    @SerializedName("date_utc")
    val dateUtc: Int = 1,
    @SerializedName("crew")
    val crew: Int = 1,
    @SerializedName("cores")
    val cores: Int = 1,
    @SerializedName("links")
    val links: Int = 1
)