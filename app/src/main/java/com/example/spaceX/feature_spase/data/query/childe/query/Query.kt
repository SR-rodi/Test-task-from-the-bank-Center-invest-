package com.example.spaceX.feature_spase.data.query.childe.query

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Query(
    @SerializedName("date_utc")
    val dateUtc: DateUtc
)