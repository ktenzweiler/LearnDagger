package com.example.learndagger.car

import android.util.Log
import com.example.learndagger.car.Car.Companion.TAG
import javax.inject.Inject

class Fuel @Inject constructor() {

    fun setListener(car: Car) {
        Log.d(TAG, "setListener: filling up car")
    }
}