package com.dicoding.kotlin.coba

import com.dicoding.kotlin.common.Hewan

fun main() {
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }

    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)
}