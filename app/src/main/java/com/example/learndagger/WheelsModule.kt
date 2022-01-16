package com.example.learndagger

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