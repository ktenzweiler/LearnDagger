package com.example.learndagger.di

import dagger.Component

@PerApplication
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentBuilder(): ActivityComponent.Builder
}