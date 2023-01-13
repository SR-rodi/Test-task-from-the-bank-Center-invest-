package com.example.spasex.feature_spase.data.dto.crew

import com.example.spasex.feature_spase.domain.model.Crew

class CrewDto(
    private val agency: String,
    private val id: String,
    private val name: String,
    private val status: String,
) {
    fun toCrew() = Crew(agency, id, name, status)
}