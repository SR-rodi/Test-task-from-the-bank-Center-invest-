package com.example.spasex.feature_spase.data.usecase_impl

import com.example.spasex.feature_spase.domain.repository.SpaseRepository
import com.example.spasex.feature_spase.domain.usecase.CrewUseCase
import javax.inject.Inject

class CrewUseCaseImpl @Inject constructor (private val spaseRepository: SpaseRepository) : CrewUseCase {

    override suspend fun getCrew(crewId: String) = spaseRepository.getCrewById(crewId)

}