package com.example.spaceX.di.module

import com.example.spaceX.core.CoroutinesDispatchersWrapper
import com.example.spaceX.core.DispatchersWrapper
import com.example.spaceX.feature_spase.data.repository_impl.SpasePagingLaunchesRepositoryImpl
import com.example.spaceX.feature_spase.data.repository_impl.SpaseRepositoryImpl
import com.example.spaceX.feature_spase.data.usecase_impl.DetailsLaunchUseCaseImpl
import com.example.spaceX.feature_spase.data.usecase_impl.LaunchUseCaseImpl
import com.example.spaceX.feature_spase.domain.repository.SpasePagingLaunchesRepository
import com.example.spaceX.feature_spase.domain.repository.SpaseRepository
import com.example.spaceX.feature_spase.domain.usecase.DetailsLaunchUseCase
import com.example.spaceX.feature_spase.domain.usecase.LaunchUseCase
import dagger.Binds
import dagger.Module

@Module
interface AppBind {
    @Binds
    fun bindLaunchUseCase(useCase: LaunchUseCaseImpl): LaunchUseCase

    @Binds
    fun bindCrewUseCase(useCase: DetailsLaunchUseCaseImpl): DetailsLaunchUseCase

    @Binds
    fun bindSpaseRepository(repository: SpaseRepositoryImpl): SpaseRepository

    @Binds
    fun bindSpasePagingLaunchesRepository(
        repository: SpasePagingLaunchesRepositoryImpl
    ): SpasePagingLaunchesRepository

    @Binds
    fun bindDispatchersWrapper(repository: CoroutinesDispatchersWrapper): DispatchersWrapper
}