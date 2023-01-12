package com.example.spasex.feature_spase.domain.model

data class Launch(
    val id: String,
    val date: Long,
    val cores: List<Int>,
    val icon: String,
    val name: String,
    val success: Boolean,
)