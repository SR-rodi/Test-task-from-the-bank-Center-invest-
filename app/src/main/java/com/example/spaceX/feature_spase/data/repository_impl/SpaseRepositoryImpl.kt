package com.example.spaceX.feature_spase.data.repository_impl

import com.example.spaceX.feature_spase.data.api.SpaseApi
import com.example.spaceX.feature_spase.domain.model.ListLaunches
import com.example.spaceX.feature_spase.data.query.childe.options.Options
import com.example.spaceX.feature_spase.data.query.childe.options.Sort
import com.example.spaceX.feature_spase.data.query.childe.query.DateUtc
import com.example.spaceX.feature_spase.data.query.childe.query.Query
import com.example.spaceX.feature_spase.data.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.domain.repository.SpaseRepository
import javax.inject.Inject

class SpaseRepositoryImpl @Inject constructor(private val api: SpaseApi) : SpaseRepository {

    private fun createQueryAndOptions(page: Int) =
        QueryAndOptions(Query(DateUtc()), Options(page, Sort(ASCENDING)))

    override suspend fun getLaunches(page: Int): ListLaunches =
        api.getLaunches(createQueryAndOptions(page)).toListLaunches()

    override suspend fun getLaunceById(launchId: String) =
        api.getOneLaunches(launchId).toDetailsLaunch()

    override suspend fun getCrewById(crewId: String) = api.getCrewById(crewId).toCrew()

    companion object {
        private const val ASCENDING = "asc"
    }
}