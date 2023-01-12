package com.example.spasex.di.module

import com.example.spasex.feature_spase.data.repository_impl.SpasePagingLaunchesRepositoryImpl
import com.example.spasex.feature_spase.data.repository_impl.SpaseRepositoryImpl
import com.example.spasex.feature_spase.data.usecase_impl.CrewUseCaseImpl
import com.example.spasex.feature_spase.data.usecase_impl.LaunchUseCaseImpl
import com.example.spasex.feature_spase.domain.repository.SpasePagingLaunchesRepository
import com.example.spasex.feature_spase.domain.repository.SpaseRepository
import com.example.spasex.feature_spase.domain.usecase.CrewUseCase
import com.example.spasex.feature_spase.domain.usecase.LaunchUseCase
import dagger.Binds
import dagger.Module

@Module
interface AppBind {
    @Binds
    fun bindLaunchUseCase(useCase: LaunchUseCaseImpl): LaunchUseCase

    @Binds
    fun bindCrewUseCase(useCase: CrewUseCaseImpl): CrewUseCase

    @Binds
    fun bindSpaseRepository(repository: SpaseRepositoryImpl): SpaseRepository

    @Binds
    fun bindSpasePagingLaunchesRepository(
        repository: SpasePagingLaunchesRepositoryImpl
    ): SpasePagingLaunchesRepository
}