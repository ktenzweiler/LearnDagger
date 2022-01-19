package com.example.learndagger

import android.app.Application
import com.example.learndagger.di.AppComponent
import com.example.learndagger.di.DaggerAppComponent

class MyApplication : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent() = appComponent
}