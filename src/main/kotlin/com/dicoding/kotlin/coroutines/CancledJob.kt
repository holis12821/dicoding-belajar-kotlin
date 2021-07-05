package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new Job!") //only job isActive has been cancled
    }

    delay(2000) //by default job akan memanggil fungsi start()

    job.cancel(cause = CancellationException("time is up!"))
    println("Canceliing job...")

    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}