package com.example.spaceX.core

import kotlinx.coroutines.Dispatchers

class CoroutinesDispatchersWrapper : DispatchersWrapper {
    override val main = Dispatchers.Main
    override val default= Dispatchers.Default
    override val io = Dispatchers.IO
}