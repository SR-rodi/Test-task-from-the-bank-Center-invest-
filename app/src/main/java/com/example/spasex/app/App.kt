package com.example.spasex.app

import android.app.Application
import android.content.Context
import com.example.spasex.di.component.AppComponent
import com.example.spasex.di.component.DaggerAppComponent

class App:Application() {

    lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}