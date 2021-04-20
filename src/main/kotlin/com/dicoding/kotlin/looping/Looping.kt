package com.dicoding.kotlin.looping

fun main() {
    whileLooping()
    doWhileLooping()
    infiniteLooping()
}

fun whileLooping() {
    var counter = 1

    while (counter <= 7) {
        println("""
            Marhaban ya ramadhan
        """.trimIndent())
        counter++
    }
}

fun doWhileLooping() {
    var counter = 8

    do {
        println("Hello, World!")
        counter++
        println(counter)
    } while (counter <= 7)
}

fun infiniteLooping() {
    val value = 'A'

    do {
        print(value)
    } while(value <= 'z')
}
