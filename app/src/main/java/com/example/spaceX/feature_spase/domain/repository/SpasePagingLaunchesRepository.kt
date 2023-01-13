package com.example.spaceX.feature_spase.domain.repository

import androidx.paging.PagingData
import com.example.spaceX.feature_spase.domain.model.Launch
import kotlinx.coroutines.flow.Flow

interface SpasePagingLaunchesRepository {

    fun loading(): Flow<PagingData<Launch>>
}