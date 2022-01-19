package com.example.learndagger.di

import com.example.learndagger.MainActivity
import com.example.learndagger.car.Car
import dagger.BindsInstance
import dagger.Subcomponent

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, ElectricMotorModule::class]
)
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@HorsePower horsePower: Int): Builder

        @BindsInstance
        fun cylinders(@Cylinders cylinders: Int): Builder

        fun build(): ActivityComponent
    }

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}