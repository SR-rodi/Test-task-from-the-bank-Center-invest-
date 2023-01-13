package com.example.spasex.feature_spase.presentation.launches

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.spasex.feature_spase.domain.repository.SpasePagingLaunchesRepository
import javax.inject.Inject

class LaunchesViewModel @Inject constructor(
    repository: SpasePagingLaunchesRepository
) : ViewModel() {

    val data = repository.loading().cachedIn(viewModelScope)

}