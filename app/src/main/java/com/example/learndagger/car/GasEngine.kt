package com.example.learndagger.car

import android.util.Log
import com.example.learndagger.car.Car.Companion.TAG
import javax.inject.Inject

class GasEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "start: Starting Gas Engine")
    }
}