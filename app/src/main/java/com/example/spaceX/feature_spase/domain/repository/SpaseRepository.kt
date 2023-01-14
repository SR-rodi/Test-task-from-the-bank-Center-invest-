package com.example.spaceX.feature_spase.domain.repository

import com.example.spaceX.feature_spase.data.query.parent.QueryAndOptions
import com.example.spaceX.feature_spase.domain.model.Crew
import com.example.spaceX.feature_spase.domain.model.DetailsLaunch
import com.example.spaceX.feature_spase.domain.model.ListLaunches

interface SpaseRepository {

    suspend fun getLaunches(query: QueryAndOptions): ListLaunches

    suspend fun getLaunceById(launchId: String): DetailsLaunch

    suspend fun getCrewById(crewId: String): Crew

}