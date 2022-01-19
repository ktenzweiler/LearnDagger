package com.example.learndagger.car

import android.util.Log
import com.example.learndagger.di.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    private val driver: Driver,
    private val wheels: Wheels,
    private val engine: Engine
) {

    fun drive() {
        engine.start()
        Log.d(TAG, "Driver = ${driver.name} car = $this")
    }

    @Inject
    fun fillUpFuel(fuel: Fuel) {
        fuel.setListener(this)
    }

    companion object {
        const val TAG = "Car"
    }
}