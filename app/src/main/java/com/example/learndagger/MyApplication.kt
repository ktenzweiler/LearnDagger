package com.example.learndagger

import android.app.Application
import com.example.learndagger.di.AppComponent
import com.example.learndagger.di.DaggerAppComponent
import com.example.learndagger.di.DriverModule

class MyApplication : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory()
            .create(DriverModule("Ricky Bobby"))
    }

    fun getAppComponent() = appComponent
}