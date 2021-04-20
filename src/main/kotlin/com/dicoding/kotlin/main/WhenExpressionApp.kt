package com.dicoding.kotlin.main

import com.dicoding.kotlin.enumeration.Color

fun main() {
    /*when expression*/
    when(Color.GREEN) {
        Color.RED ->  println("Color is RED")
        Color.BLUE -> println("Color is BLUE")
        Color.GREEN -> println("Color is GREEN")
    }
}