package com.example.learndagger.di

import com.example.learndagger.car.ElectricMotor
import com.example.learndagger.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class ElectricMotorModule {

    @Binds
    abstract fun bindElectricMotor(electricMotor: ElectricMotor): Engine
}