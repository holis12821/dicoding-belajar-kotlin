package com.dicoding.kotlin.network

import com.dicoding.kotlin.model.JokeApiResponse
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.http.GET

interface JokeApiServices {
    /*set the method get or post*/
    @GET("jokes/random")
    fun randomJoke(): Single<JokeApiResponse>

}