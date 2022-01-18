package com.example.learndagger.car

import android.util.Log
import com.example.learndagger.car.Car.Companion.TAG
import javax.inject.Inject

class GasEngine @Inject constructor(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "start: Starting Gas Engine. Horse Power = $horsePower")
    }
}