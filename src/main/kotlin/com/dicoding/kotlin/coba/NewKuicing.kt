package com.dicoding.kotlin.coba

import com.dicoding.kotlin.common.Kucing

class NewKucing: Kucing() {
    fun grooming() {
        println("Meong")
    }
}


fun main() {
    val kucing = Kucing()
    kucing as NewKucing
    kucing.grooming()
}