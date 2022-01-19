package com.example.learndagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndagger.car.Car
import com.example.learndagger.di.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerActivityComponent.builder()
            .horsePower(1000)
            .cylinders(0)
            .appComponent((application as MyApplication).getAppComponent())
            .build()

        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car1.drive()
        car2.drive()
    }
}