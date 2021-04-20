package com.dicoding.kotlin.datatype

fun main() {
    val array = Array(4) { i -> i * i }
    for (i in array.indices) {
        println("index ke : ${array[i]}")
    }
    setUser("Nurholis", 21)
    printUser("Alfian")
}

fun setUser(name: String, age: Int): String = "Your name is $name. and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}