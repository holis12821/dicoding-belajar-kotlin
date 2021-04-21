package com.dicoding.kotlin.view

import com.dicoding.kotlin.model.Joke
import com.dicoding.kotlin.network.JokeApiServicesFactory
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

fun main() {
    displayApiJoke()
}

fun displayApiJoke() {
    val apiService = JokeApiServicesFactory.createServices()
    val jokeObservable : Single<Joke>? =
        apiService.randomJoke().map { it.joke }

    jokeObservable
        ?.subscribeOn(Schedulers.io())
        ?.observeOn(Schedulers.newThread())
        ?.subscribe { t1, t2 ->
            println(t1.jokeText)
            println(t2)
        }
}