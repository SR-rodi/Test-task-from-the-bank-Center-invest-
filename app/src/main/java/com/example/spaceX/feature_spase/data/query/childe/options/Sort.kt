package com.example.spaceX.feature_spase.data.query.childe.options

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Sort(
    @SerializedName("date_unix")
    val dateUnix: String = "asc"
)