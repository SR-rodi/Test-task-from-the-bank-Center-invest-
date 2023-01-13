package com.example.spasex.feature_spase.presentation.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.spasex.feature_spase.data.repository_impl.SpasePagingLaunchesRepositoryImpl
import com.example.spasex.feature_spase.domain.usecase.DetailsLaunchUseCase
import com.example.spasex.feature_spase.presentation.details.DetailsViewModel
import com.example.spasex.feature_spase.presentation.launches.LaunchesViewModel
import javax.inject.Inject

@Suppress("UNCHECKED_CAST", "KotlinConstantConditions")
class ViewModelFactory @Inject constructor (
    private val repository: SpasePagingLaunchesRepositoryImpl,
    private val crewUseCase: DetailsLaunchUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when (modelClass) {
            LaunchesViewModel::class.java -> LaunchesViewModel(repository) as T
            DetailsViewModel::class.java -> DetailsViewModel(crewUseCase) as T
            else -> throw IllegalStateException("no ViewModelProvider")
        }
    }
}