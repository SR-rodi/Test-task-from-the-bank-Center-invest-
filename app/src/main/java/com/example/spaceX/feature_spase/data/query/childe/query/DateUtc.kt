package com.example.spaceX.feature_spase.data.query.childe.query

import com.google.gson.annotations.SerializedName

@kotlinx.serialization.Serializable
class DateUtc(
    @SerializedName("\$gte")
    var from: String = "2021-00-00T00:00:00.000Z"
)