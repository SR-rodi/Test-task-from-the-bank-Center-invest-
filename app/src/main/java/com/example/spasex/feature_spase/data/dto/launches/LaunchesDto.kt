package com.example.spasex.feature_spase.data.dto.launches

import com.example.spasex.feature_spase.domain.model.Launch
import com.google.gson.annotations.SerializedName

class LaunchesDto(
    @SerializedName("date_unix") val date: Long,
    private val id: String,
    private val cores: List<CoreDto>,
    private val links: LinksDto,
    private val name: String,
    private val success: Boolean,
) {
    private fun toListFlight() = this.cores.map { coreDto -> coreDto.flight }

    fun toLaunch() = Launch(id, date, toListFlight(), links.patch.small, name, success)
}