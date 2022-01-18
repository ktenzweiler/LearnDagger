package com.example.learndagger.di

import com.example.learndagger.car.ElectricMotor
import com.example.learndagger.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class ElectricMotorModule constructor(private val horsePower: Int) {

    @Provides
    fun provideElectricMotor() : Engine = ElectricMotor(horsePower)
}