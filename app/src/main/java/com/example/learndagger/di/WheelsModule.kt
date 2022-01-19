package com.example.learndagger.di

import com.example.learndagger.car.Rims
import com.example.learndagger.car.Tires
import com.example.learndagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {

    @JvmStatic
    @Provides
    fun provideRims() = Rims()

    @JvmStatic
    @Provides
    fun provideTires() : Tires {
        val tires = Tires()
        tires.inflateTires()

        return tires
    }

    @JvmStatic
    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}