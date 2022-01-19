package com.example.learndagger.di

import com.example.learndagger.MainActivity
import com.example.learndagger.car.Car
import dagger.BindsInstance
import dagger.Component

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, ElectricMotorModule::class]
)
interface ActivityComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@HorsePower horsePower: Int): Builder

        @BindsInstance
        fun cylinders(@Cylinders cylinders: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}