package com.example.spasex.feature_spase.presentation.launches

import androidx.lifecycle.ViewModel
import com.example.spasex.feature_spase.domain.repository.SpasePagingLaunchesRepository
import com.example.spasex.feature_spase.domain.usecase.LaunchUseCase
import javax.inject.Inject

class LaunchesViewModel @Inject constructor (
    private val repository: SpasePagingLaunchesRepository
    ) : ViewModel() {
    // TODO: Implement the ViewModel
}