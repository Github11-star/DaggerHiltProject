package com.firozpoc.daggerhiltproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firozpoc.daggerhiltproject.di.Car
import com.firozpoc.daggerhiltproject.retrofitinjection.RetrofitInjection
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var retrofitInjection: RetrofitInjection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.makeToastInCar(context = this)

        retrofitInjection.makeToastInRetrofitInjection(context = this)
    }
}