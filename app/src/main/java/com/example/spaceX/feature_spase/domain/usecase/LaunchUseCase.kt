package com.example.spaceX.feature_spase.domain.usecase

import com.example.spaceX.feature_spase.data.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.domain.model.ListLaunches

interface LaunchUseCase {

    suspend fun getLaunches( query: QueryAndOptions): ListLaunches
}