package com.example.spasex.di.component

import com.example.spasex.di.module.Module
import com.example.spasex.feature_spase.presentation.factory.ViewModelFactory
import dagger.Component

@Component(modules = [Module::class])
interface AppComponent {

    val viewModelFactory: ViewModelFactory
}