package com.example.spaceX.feature_spase.presentation.details

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spaceX.core.DispatchersWrapper
import com.example.spaceX.core.state.LoadState
import com.example.spaceX.feature_spase.domain.model.DetailsLaunch
import com.example.spaceX.feature_spase.domain.usecase.DetailsLaunchUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailsViewModel @Inject constructor(
    private val detailUseCase: DetailsLaunchUseCase,
    private val dispatchers: DispatchersWrapper,
) : ViewModel() {

    private val _data = MutableSharedFlow<DetailsLaunch>()
    val data = _data.asSharedFlow()

    private val _loadState = MutableStateFlow(LoadState.LOADING)
    val loadState = _loadState.asStateFlow()

    private val handler = CoroutineExceptionHandler { _, T ->
        Log.e("Kart", "${T.message}")
        _loadState.value = LoadState.ERROR
    }

    fun getData(id: String) {
        viewModelScope.launch(dispatchers.io + handler) {
            _loadState.value = LoadState.LOADING

            val item = detailUseCase.getLaunchById(id)

            _data.emit(item)

            _loadState.value = if (item.crewListItem.isEmpty()) LoadState.SUCCESS_EMPTY_CREW
            else LoadState.SUCCESS_NOT_EMPTY_CREW
        }
    }
}