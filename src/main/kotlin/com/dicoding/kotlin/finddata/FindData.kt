package com.dicoding.kotlin.finddata

fun main() {
    val listOf = listOf(1,2,3,4,5,6,7,8,9,10)
    val findData = listOf.find { it % 2 == 0 }
    //jadi akan mencari angka genap yg kita dapatka pertama kali dari interface list
    //ketika kita dapat item datanya maka yaudah inilah data yg kita dapatkan pertama yg terdapat di
    //interface collection
    //find, firstOrNull akan mencaridata dari awal sampai akhir
    //kebalkannya lastOrNull akan mencari data dari akhir hingga awal
    println(findData)
}