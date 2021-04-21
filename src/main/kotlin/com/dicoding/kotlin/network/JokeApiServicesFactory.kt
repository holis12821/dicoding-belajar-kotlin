package com.dicoding.kotlin.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object JokeApiServicesFactory {
    /*create services from API*/
    fun createServices(): JokeApiServices = Retrofit.Builder()
        .baseUrl("http://api.icndb.com")
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .build()
        .create(JokeApiServices::class.java)

}
