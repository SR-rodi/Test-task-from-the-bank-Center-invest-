package com.example.spaceX.di.component

import com.example.spaceX.di.module.Module
import com.example.spaceX.feature_spase.presentation.factory.ViewModelFactory
import dagger.Component

@Component(modules = [Module::class])
interface AppComponent {

    val viewModelFactory: ViewModelFactory
}