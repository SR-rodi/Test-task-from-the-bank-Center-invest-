package com.example.spasex.feature_spase.domain.usecase

import com.example.spasex.feature_spase.domain.model.ListLaunches

interface LaunchUseCase {

    suspend fun getLaunches(page: Int): ListLaunches
}