package com.example.spasex.feature_spase.domain.model

class Crew(
    val agency: String,
    val id: String,
    val image: String,
    val launches: List<String>,
    val name: String,
    val status: String,
    val wikipedia: String
)