package com.example.learndagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {

        val component = DaggerCarComponent.create()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car = component.getCar()

        car.drive()
    }
}