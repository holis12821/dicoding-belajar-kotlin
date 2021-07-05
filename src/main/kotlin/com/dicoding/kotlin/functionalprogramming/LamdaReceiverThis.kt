package com.dicoding.kotlin.functionalprogramming

fun main() {
    /** lamda receiver (this) / merujuk ke objek saat ini yg
     *  memanggil lamda tersebut
     *  */
    val buildString = StringBuilder().apply {
        append("Hello")
        append("Kotlin")
    }


    println(buildString)
    letLamda()
    runLamda()
    runLamda2()
    withLamda()
    withLamdaReturning()
    noApplyLamda()
    applyLamda()
}

fun letLamda() {
    val text = "Hello"
    text.let {
        val message = "$it kotlin"
        println(message)
    }
}

fun runLamda() {
    val text = "Hello"
    val result  = text.run {
        val from = this
        val to =  this.replace("Hello", "Kotlin")
        "Replace text from $from to $to"
    }
    println("result: $result")
}

fun runLamda2() {
    val value = 10
    val result = value.run {
        val value1 = this
        val value2 = this
        value1 + value2
    }
    println(result)
}


/**
 * Nilai yang akan dikembalikan adalah
 *berdasarkan expression yang berada
 * di dalam blok lambda.*/
fun withLamda() {
    val message = "Hello Kotlin !"
    val result = with(message) {
        println("Value is $this")
        println("with length ${this.length}")
    }
    result.toString()
}

/**
 * Fungsi with sendiri disarankan untuk mengakses apa yang
 * menjadi anggotanya tanpa harus menyediakan nilai kembalian.*/
fun withLamdaReturning() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this.length - 1}"
    }

    println(result)
}

fun noApplyLamda() {
    val builder = StringBuilder()
    builder.append("Hello")
    builder.append("Kotlin!")

    println(builder.toString())
}

fun applyLamda() {
    val message = StringBuilder().apply {
        append("Hello")
        append("Kotlin!")
    }
    println(message.toString())
}




