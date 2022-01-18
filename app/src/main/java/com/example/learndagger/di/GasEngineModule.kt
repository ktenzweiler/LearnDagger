package com.example.learndagger.di

import com.example.learndagger.car.Engine
import com.example.learndagger.car.GasEngine
import dagger.Module
import dagger.Provides

@Module
class GasEngineModule {

    @Provides
    fun provideGasEngine(gasEngine: GasEngine) : Engine = gasEngine
}