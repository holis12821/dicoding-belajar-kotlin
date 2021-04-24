package com.dicoding.kotlin.difference

class DifferenceObject {

    fun cek() {
        val difference = DifferenceObject()
        println("Obj diri sendiri : ${this.hashCode()}")
        println("Obj hashCode 2 : ${difference.hashCode()}")
        println("Obj class 2 : ${difference.javaClass}")
    }
}