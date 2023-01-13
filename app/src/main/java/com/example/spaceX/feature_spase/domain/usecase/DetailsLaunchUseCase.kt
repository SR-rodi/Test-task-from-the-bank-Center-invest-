package com.example.spaceX.feature_spase.domain.usecase

import com.example.spaceX.feature_spase.domain.model.DetailsLaunch

interface DetailsLaunchUseCase {

    suspend fun getLaunchById(launchId: String): DetailsLaunch
}