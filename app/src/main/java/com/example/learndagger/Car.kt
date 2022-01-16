package com.example.learndagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val wheels: Wheels,
    private val engine: Engine
) {

    fun drive() {
        Log.d(TAG, "drive: Vrooooooom!!!")
    }

    @Inject
    fun fillUpFuel(fuel: Fuel) {
        fuel.setListener(this)
    }

    companion object {
        const val TAG = "Car"
    }
}