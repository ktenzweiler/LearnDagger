package com.example.learndagger.di

import com.example.learndagger.car.Driver
import dagger.Module
import dagger.Provides

@Module
class DriverModule constructor(private val name: String) {

    @PerApplication
    @Provides
    fun provideDriver() = Driver(name)
}