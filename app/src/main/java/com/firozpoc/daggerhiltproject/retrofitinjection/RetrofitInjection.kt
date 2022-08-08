package com.firozpoc.daggerhiltproject.retrofitinjection

import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitInjection @Inject constructor(val retrofit: Retrofit) {

    fun makeToastInRetrofitInjection(context: Context){

        Toast.makeText(context,"Retrofit Injection done", Toast.LENGTH_LONG).show()
    }
}