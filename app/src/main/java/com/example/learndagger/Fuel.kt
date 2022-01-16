package com.example.learndagger

import android.util.Log
import com.example.learndagger.Car.Companion.TAG
import javax.inject.Inject

class Fuel @Inject constructor() {

    fun setListener(car:Car) {
        Log.d(TAG, "setListener: filling up car")
    }
}