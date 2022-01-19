package com.example.learndagger.di

import com.example.learndagger.car.Driver
import dagger.Module
import dagger.Provides

@Module
object DriverModule {

    @JvmStatic
    @PerApplication
    @Provides
    fun provideDriver() = Driver()
}