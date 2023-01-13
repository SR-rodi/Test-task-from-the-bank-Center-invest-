package com.example.spaceX.feature_spase.domain.usecase

import com.example.spaceX.feature_spase.domain.model.ListLaunches

interface LaunchUseCase {

    suspend fun getLaunches(page: Int): ListLaunches
}