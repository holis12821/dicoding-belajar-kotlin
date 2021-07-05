package com.dicoding.kotlin.oopnew

open class Animal( val name: String,
                   val weight: Double,
                   val age: Int,
                   val isCarnivore: Boolean) {
    open fun eat() {
        println("$name Sedang makan !")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}