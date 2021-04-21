package com.dicoding.kotlin.rxjava

import io.reactivex.Observable

fun main() {
    setObservableToArray()
}

fun setObservableToArray() {
    Observable.fromArray("Nurholis", "Wahyu", "Alfat", "Aldi", "Ahmad")
        .map {
            it.toUpperCase()
        }.filter { it.startsWith("A")
        }.subscribe {
            println(it)
        }.dispose()
}