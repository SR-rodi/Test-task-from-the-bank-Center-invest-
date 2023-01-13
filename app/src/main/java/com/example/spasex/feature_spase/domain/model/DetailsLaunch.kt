package com.example.spasex.feature_spase.domain.model

class DetailsLaunch(
    val id: String,
    val date: Long,
    val cores: List<Int>,
    val icon: String,
    val name: String,
    val success: Boolean,
    val crewListId: List<String>,
    val details: String?,
    val crewListItem:MutableList<Crew> = mutableListOf()
)