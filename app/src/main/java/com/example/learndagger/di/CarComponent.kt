package com.example.learndagger.di

import com.example.learndagger.MainActivity
import com.example.learndagger.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, ElectricMotorModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}