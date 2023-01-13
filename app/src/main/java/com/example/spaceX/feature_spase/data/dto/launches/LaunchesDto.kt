package com.example.spaceX.feature_spase.data.dto.launches

import com.example.spaceX.feature_spase.domain.model.DetailsLaunch
import com.example.spaceX.feature_spase.domain.model.Launch
import com.google.gson.annotations.SerializedName

class LaunchesDto(
    @SerializedName("date_unix") val date: Long,
    private val id: String,
    private val cores: List<CoreDto>,
    private val links: LinksDto,
    private val name: String,
    private val success: Boolean,
    private val crew: List<String>,
    private val details: String?,
    private val date_utc: String
) {
    private fun toListFlight() = this.cores.map { coreDto -> coreDto.flight }

    fun toLaunch() = Launch(id, date, toListFlight(), links.patch.small, name, success, date_utc)

    fun toDetailsLaunch() =
        DetailsLaunch(id, date, toListFlight(), links.patch.large, name, success, crew, details)
}