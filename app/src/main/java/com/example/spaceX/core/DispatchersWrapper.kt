package com.example.spaceX.core

import kotlinx.coroutines.CoroutineDispatcher

interface DispatchersWrapper {
    val main: CoroutineDispatcher
    val default: CoroutineDispatcher
    val io: CoroutineDispatcher
}