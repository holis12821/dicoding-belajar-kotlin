package com.dicoding.kotlin.functionalprogramming

fun main() {

    val value: Int? = null
    println(value.slice)
}
//Int?.slice atau class Int yg
// menambahkan extension properti
//ini tdk akan dijalankan propertinya
//ketika objeknya null yaudah objeknya aja yg dieksekusi
//val Int?.slice: Int //class integer yg nullable yg menambah ekstension functon
//get() = /*ini sadalah safe calls*/ this?.div(2) ?: 0  //sebagai contoh ini
//walau slice nya mendapatkan nilai null
//karna objek yg saat ini mengakses properti slice adalah value
//bertipe Int yg objeknya null maka saat kita panggil propertinya
//akan tetap menjadi null karena properti slicenya itu menampung nilai null
//ekstensionnya propertinya tetap bisa diakses karna hanya penambahan fungsi atau properti saja




