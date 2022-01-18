package com.example.learndagger.di

import com.example.learndagger.car.Engine
import com.example.learndagger.car.GasEngine
import dagger.Binds
import dagger.Module

@Module
abstract class GasEngineModule {

    @Binds
    abstract fun provideGasEngine(gasEngine: GasEngine): Engine
}