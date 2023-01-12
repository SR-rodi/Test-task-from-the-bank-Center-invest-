package com.example.spasex.feature_spase.presentation.details

import androidx.lifecycle.ViewModel
import com.example.spasex.feature_spase.domain.usecase.CrewUseCase
import javax.inject.Inject

class DetailsViewModel @Inject constructor(
    private val crewUseCase: CrewUseCase
) : ViewModel() {
}