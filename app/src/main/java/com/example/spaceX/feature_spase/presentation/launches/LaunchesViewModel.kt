package com.example.spaceX.feature_spase.presentation.launches

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.spaceX.feature_spase.domain.repository.SpasePagingLaunchesRepository
import javax.inject.Inject

class LaunchesViewModel @Inject constructor(
    repository: SpasePagingLaunchesRepository
) : ViewModel() {

    val data = repository.loading(START_YEAR).cachedIn(viewModelScope)


    companion object {
        const val START_YEAR = 2021
    }
}