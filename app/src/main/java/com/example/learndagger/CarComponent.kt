package com.example.learndagger

import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car
}