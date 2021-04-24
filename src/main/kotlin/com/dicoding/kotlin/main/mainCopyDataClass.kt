package com.dicoding.kotlin.main

import com.dicoding.kotlin.copy.CopyDataClass

fun main() {
    val dataUser = CopyDataClass("Nurholis", 21)
    val dataUser2 = CopyDataClass("Nurholis", 21)
    val dataUser3 = CopyDataClass("dimas", 24)
    /*copying objek data class*/
    val dataUser4 = dataUser.copy()
    /*menyalin objeknya saja atau nilai objeknya saja*/
    /*mengganti nilai dari property pada objek menggunakan method
    * copy()*/
    /*same*/

    println(dataUser)
    println(dataUser2)

    println(dataUser.hashCode())
    println(dataUser4.hashCode())

    val dataUser5 = dataUser2.copy(age = 22)
    /*membuatkan objek baru menggunakan objek yg sudah ada
    * karena kita merubah propertinya otomatis 2 objek ini berbeda
    * karena berbeda alamat memory*/

    println(dataUser5)
    println(dataUser5.hashCode())
    println(dataUser)
    println(dataUser.hashCode())
}
