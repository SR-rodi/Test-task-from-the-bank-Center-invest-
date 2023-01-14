package com.example.spaceX.feature_spase.data.repository_impl

import com.example.spaceX.feature_spase.data.api.SpaseApi
import com.example.spaceX.feature_spase.data.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.domain.repository.SpaseRepository
import javax.inject.Inject

class SpaseRepositoryImpl @Inject constructor(private val api: SpaseApi) : SpaseRepository {

    override suspend fun getLaunches(query: QueryAndOptions) =
        api.getLaunches(query).toListLaunches()


    override suspend fun getLaunceById(launchId: String) =
        api.getOneLaunches(launchId).toDetailsLaunch()

    override suspend fun getCrewById(crewId: String) = api.getCrewById(crewId).toCrew()
}