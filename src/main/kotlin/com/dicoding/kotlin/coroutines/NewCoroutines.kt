package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
 //the run block to start main coroutine
    launch {
        //the block launch to runnew coroutines
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}