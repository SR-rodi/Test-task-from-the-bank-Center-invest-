package com.example.spasex.core

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import coil.load
import com.example.spasex.R
import com.example.spasex.app.App
import com.example.spasex.di.component.AppComponent
import java.text.SimpleDateFormat

fun Context.appComponent(): AppComponent =
    when (this) {
        is App -> appComponent
        else -> this.applicationContext.appComponent()
    }

@SuppressLint("SimpleDateFormat")
fun TextView.setDateFormat(date: Long) {
    this.text = SimpleDateFormat("HH:mm dd-MM-yyyy").format(date)
}

fun ImageView.loadingImage(url:Any){
    this.load(url){
        crossfade(true)
        placeholder(R.drawable.ic_placeholder)
        error(R.drawable.ic_error_image)
    }
}