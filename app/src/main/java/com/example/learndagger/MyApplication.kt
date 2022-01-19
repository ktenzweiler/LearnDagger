package com.example.learndagger

import android.app.Application
import com.example.learndagger.di.AppComponent
import com.example.learndagger.di.DaggerAppComponent

class MyApplication : Application() {

    private lateinit var activityComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        activityComponent = DaggerAppComponent.create()
    }

    fun getAppComponent() = activityComponent
}