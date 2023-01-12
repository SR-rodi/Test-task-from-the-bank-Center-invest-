package com.example.spasex.core

import androidx.lifecycle.ViewModel
import com.example.spasex.core.state.LoadState
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class BaseViewModel : ViewModel() {

    abstract class BaseViewModel<T : Any> : ViewModel() {

        protected val _loadState =
            MutableStateFlow(LoadState.SUCCESS)
        val loadState = _loadState.asStateFlow()

        protected val handler = CoroutineExceptionHandler { _, t ->
            _loadState.value = LoadState.ERROR
        }

    }
}
