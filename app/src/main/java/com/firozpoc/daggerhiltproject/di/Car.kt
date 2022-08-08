package com.firozpoc.daggerhiltproject.di

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class Car @Inject constructor(
    engine: Engine,
    wheel: Wheel
) {
    
    fun makeToastInCar(context: Context){
        Toast.makeText(context, "In car class", Toast.LENGTH_LONG).show()
    }
}