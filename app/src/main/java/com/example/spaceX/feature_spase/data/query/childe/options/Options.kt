package com.example.spaceX.feature_spase.data.query.childe.options
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Options(
    @SerializedName("page")
    var page: Int,
    @SerializedName("sort")
    val sort: Sort = Sort()
)