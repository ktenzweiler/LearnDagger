package com.example.learndagger

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}