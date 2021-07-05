package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    //job is initialize with state (new)
    val job1 = launch(start = CoroutineStart.LAZY) {
     //the job has run if needed

        delay(1000L)
        println("Start a new Job")
    }

    job1.start()
    println("Other task")

    job1.join()
    println("Other task")

    /**
     * Perbedaan dari keduanya antara start dan join adalah bahwa
     * yang start() akan memulai job tanpa harus menunggu job tersebut
     * selesai, sedangkan join() akan menunda
     * eksekusi sampai job selesai.*/

    //setelah dijakanlan job akan memiliki kondisi state yaitu active

    //jon2
    //the job is initialize has been running
    val job2 = launch {

    }
}