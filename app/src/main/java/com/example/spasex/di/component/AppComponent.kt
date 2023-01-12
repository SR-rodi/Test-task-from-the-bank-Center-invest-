package com.example.spasex.di.component

import com.example.spasex.di.module.Module
import com.example.spasex.feature_spase.presentation.factory.ViewModelFactory
import com.example.spasex.feature_spase.presentation.details.DetailsFragment
import com.example.spasex.feature_spase.presentation.launches.LaunchesFragment
import dagger.Component

@Component(modules = [Module::class])
interface AppComponent {

    fun inject(fragment: LaunchesFragment)
    fun inject(fragment: DetailsFragment)

    val viewModelFactory: ViewModelFactory
}