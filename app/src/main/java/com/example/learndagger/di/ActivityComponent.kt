package com.example.learndagger.di

import com.example.learndagger.MainActivity
import com.example.learndagger.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, GasEngineModule::class]
)
interface ActivityComponent {

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun horsePower(@HorsePower horsePower: Int): Builder
//
//        @BindsInstance
//        fun cylinders(@Cylinders cylinders: Int): Builder
//
//        fun appComponent(appComponent: AppComponent): Builder
//
//        fun build(): ActivityComponent
//    }

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}