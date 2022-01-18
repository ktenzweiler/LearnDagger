package com.example.learndagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndagger.car.Car
import com.example.learndagger.di.DaggerCarComponent
import com.example.learndagger.di.ElectricMotorModule
import com.example.learndagger.di.GasEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerCarComponent.builder()
            .electricMotorModule(ElectricMotorModule(1000))
            .build()

        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.drive()
    }
}