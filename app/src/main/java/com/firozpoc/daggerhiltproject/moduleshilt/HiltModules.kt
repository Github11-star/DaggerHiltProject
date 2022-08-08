package com.firozpoc.daggerhiltproject.moduleshilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HiltModules {

    @Singleton
    @Provides
    fun provideRetrofitObject() : Retrofit {

        return Retrofit.Builder().baseUrl("https://www.google.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}