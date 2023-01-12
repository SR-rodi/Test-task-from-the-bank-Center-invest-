package com.example.spasex.feature_spase.data.repository_impl

import com.example.spasex.feature_spase.data.api.SpaseApi
import com.example.spasex.feature_spase.domain.repository.SpaseRepository
import javax.inject.Inject

class SpaseRepositoryImpl @Inject constructor (private val api: SpaseApi) : SpaseRepository {

    override suspend fun getLaunches(page: Int) = api.getLaunches().toListLaunches()

    override suspend fun getCrewById(crewId: String) = api.getCrew(crewId).toCrew()
}