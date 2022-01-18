package com.example.learndagger.car

import android.util.Log
import com.example.learndagger.Cylinders
import com.example.learndagger.HorsePower
import com.example.learndagger.car.Car.Companion.TAG
import javax.inject.Inject

class ElectricMotor @Inject constructor(
    @HorsePower private val horsePower: Int,
    @Cylinders private val cylinders: Int
) : Engine {
    override fun start() {
        Log.d(
            TAG,
            "start: Starting electric motor. Horse Power = $horsePower number of cylinders = $cylinders"
        )
    }
}