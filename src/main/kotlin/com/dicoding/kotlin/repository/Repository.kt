package com.dicoding.kotlin.repository

fun main() {
    findData()
}


fun findData() {
    val numberOddNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberOddNumber.find { it % 2 == 1 }
    val firstOrNullNumber = numberOddNumber.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberOddNumber.lastOrNull { it % 2 == 0 }
    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)

}