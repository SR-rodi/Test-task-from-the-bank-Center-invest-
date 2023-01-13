package com.example.spaceX.app

import android.app.Application
import com.example.spaceX.di.component.AppComponent
import com.example.spaceX.di.component.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}