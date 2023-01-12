package com.example.spasex.core

import android.content.Context
import com.example.spasex.app.App
import com.example.spasex.di.component.AppComponent

fun Context.appComponent(): AppComponent =
    when(this){
        is App -> appComponent
        else -> this.applicationContext.appComponent()
    }