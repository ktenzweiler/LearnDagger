package com.example.learndagger.di

import dagger.Component

@PerApplication
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }
}