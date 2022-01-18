package com.example.learndagger.di

import com.example.learndagger.car.Engine
import com.example.learndagger.car.GasEngine
import dagger.Module
import dagger.Provides

@Module
class GasEngineModule constructor(private val horsePower: Int){

    @Provides
    fun provideGasEngine(): Engine = GasEngine(horsePower)
}