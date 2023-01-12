package com.example.spasex.feature_spase.domain.usecase

import com.example.spasex.feature_spase.domain.model.Crew

interface CrewUseCase {

    suspend fun getCrew(crewId:String): Crew
}