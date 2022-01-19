package com.example.learndagger.di

import com.example.learndagger.Cylinders
import com.example.learndagger.HorsePower
import com.example.learndagger.MainActivity
import com.example.learndagger.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, ElectricMotorModule::class])
interface CarComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@HorsePower horsePower: Int) : Builder

        @BindsInstance
        fun cylinders(@Cylinders cylinders: Int) : Builder

        fun build(): CarComponent
    }

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}