package com.example.spasex.feature_spase.presentation.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spasex.feature_spase.domain.model.DetailsLaunch
import com.example.spasex.feature_spase.domain.usecase.DetailsLaunchUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailsViewModel @Inject constructor(
    private val crewUseCase: DetailsLaunchUseCase
) : ViewModel() {

    private val _data = MutableSharedFlow<DetailsLaunch>()
    val data = _data.asSharedFlow()

    fun getData(id:String){
        viewModelScope.launch (Dispatchers.IO){
           _data.emit( crewUseCase.getLaunchById(id))
        }
    }
}