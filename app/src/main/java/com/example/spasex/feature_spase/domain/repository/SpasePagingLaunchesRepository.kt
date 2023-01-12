package com.example.spasex.feature_spase.domain.repository

import androidx.paging.PagingData
import com.example.spasex.feature_spase.domain.model.Launch
import kotlinx.coroutines.flow.Flow

interface SpasePagingLaunchesRepository {

    fun loading(): Flow<PagingData<Launch>>
}