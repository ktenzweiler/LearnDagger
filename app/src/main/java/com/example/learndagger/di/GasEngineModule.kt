package com.example.learndagger.di

import com.example.learndagger.car.Engine
import com.example.learndagger.car.GasEngine
import dagger.Module
import dagger.Provides

@Module
class GasEngineModule constructor(
    private val horsePower: Int,
    private val cylinders: Int
) {

    @HorsePower
    @Provides
    fun horsePower() =horsePower

    @Cylinders
    @Provides
    fun cylinders() = cylinders

    @Provides
    fun provideGasEngine(gasEngine: GasEngine): Engine = gasEngine
}