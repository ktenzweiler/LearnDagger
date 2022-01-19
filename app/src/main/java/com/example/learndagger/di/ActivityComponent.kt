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

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @HorsePower horsePower: Int,
            @BindsInstance @Cylinders cylinders: Int
        ): ActivityComponent
    }

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}