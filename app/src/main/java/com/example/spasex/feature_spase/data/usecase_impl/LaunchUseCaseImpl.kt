package com.example.spasex.feature_spase.data.usecase_impl

import com.example.spasex.feature_spase.domain.repository.SpaseRepository
import com.example.spasex.feature_spase.domain.usecase.LaunchUseCase
import javax.inject.Inject


class LaunchUseCaseImpl @Inject constructor (private val spaseRepository: SpaseRepository) : LaunchUseCase {

    override suspend fun getLaunches(page: Int) = spaseRepository.getLaunches(page)


}