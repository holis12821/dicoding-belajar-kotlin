package com.dicoding.kotlin.functionalprogramming

fun main() {
    lamdaLet()
    alsoLamda()
}




fun lamdaLet() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "Text length $length"
        println(text)
        /** run digunakan hanya untuk inisialisasi objek dan
         * untuk mengembalikan nilai seperti perhitungan dllya
         * karena dia merupakan fungsi biasa dan lamdanya tanpa paramter
         * atau function typenya tanpa parameter
         * hanya tipe kembalian saja*/
    } ?: run {
        val text = "message is null"
        println(text)
    }
}
/**
 *  Fungsi also baiknya digunakan ketika kita
 *  ingin menggunakan konteks dari objek sebagai argumen
 *  tanpa harus mengubah nilainya.*/
fun alsoLamda() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}