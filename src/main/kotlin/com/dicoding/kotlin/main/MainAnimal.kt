package com.dicoding.kotlin.main

import com.dicoding.kotlin.common.Hewan
import com.dicoding.kotlin.common.Kucing

fun main() {
    val hewan: Hewan = Kucing()

    println("Kucing berwarna : ${hewan.color}")
    println("Tinggi : ${hewan.height}")
    println("Berat awal : ${hewan.weight}")
    println(hewan.eating())
}