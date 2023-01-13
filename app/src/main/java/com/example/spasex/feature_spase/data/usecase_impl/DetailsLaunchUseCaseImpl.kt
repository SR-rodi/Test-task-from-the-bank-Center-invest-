package com.example.spasex.feature_spase.data.usecase_impl

import com.example.spasex.feature_spase.domain.model.DetailsLaunch
import com.example.spasex.feature_spase.domain.repository.SpaseRepository
import com.example.spasex.feature_spase.domain.usecase.DetailsLaunchUseCase
import javax.inject.Inject

class DetailsLaunchUseCaseImpl @Inject constructor(
    private val spaseRepository: SpaseRepository
) : DetailsLaunchUseCase {

    override suspend fun getLaunchById(launchId: String): DetailsLaunch {
        val detail = spaseRepository.getLaunceById(launchId)

        if (detail.crewListId.isNotEmpty())
            detail.crewListId.forEach {
                detail.crewListItem.add(spaseRepository.getCrewById(it))
            }

        return detail
    }
}