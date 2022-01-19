package com.example.learndagger.di

import com.example.learndagger.car.Driver
import dagger.Component

@PerApplication
@Component(modules = [DriverModule::class])
interface AppComponent {

    // fun getDriver(): Driver

    fun getActivityComponent(gasEngineModule: GasEngineModule): ActivityComponent
}