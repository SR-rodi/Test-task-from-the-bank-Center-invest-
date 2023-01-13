package com.example.spaceX.feature_spase.data.repository_impl

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.spaceX.core.pagin_sourc.LaunchesPagingSource
import com.example.spaceX.feature_spase.domain.repository.SpasePagingLaunchesRepository
import com.example.spaceX.feature_spase.domain.usecase.LaunchUseCase
import javax.inject.Inject

class SpasePagingLaunchesRepositoryImpl @Inject constructor(
    private val launchUseCase: LaunchUseCase
) : SpasePagingLaunchesRepository {

    override fun loading() = Pager(
        config = PagingConfig(
            pageSize = 10,
            enablePlaceholders = false
        ),
        pagingSourceFactory = { LaunchesPagingSource(launchUseCase) }
    ).flow
}