package com.example.spasex.feature_spase.domain.model

import com.example.spasex.feature_spase.data.dto.launches.LaunchesDto

class ListLaunches(
    val docs: List<Launch>,
    val totalPages: Int,
)