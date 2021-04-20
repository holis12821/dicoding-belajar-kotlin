package com.dicoding.kotlin.datatype

fun main() {
    var vocal = 'A' /*vocal = A  0041
    vocal++ = vocal = vocal + 1
                      0041 + 1*/
    //vocal++
    println("Vocal : ${vocal++}") /*karena ini postfix increament jadi dinaikan setelah di evaluasi
    jdi awal nya diampilkan dulu baru setelahnya dievaluasi*/
    //--vocal dan votcal++ adalah 2 operator yg berbeda
    println("Vocal : ${++vocal}")
    println("Vocal : ${--vocal}")
    println("Vocal : ${vocal++}")
    println("Vocal : ${vocal++}")
    println("Vocal :${vocal--}")
    println("Vocal :${vocal--}")
    println("Vocal :${vocal--}")
    @Suppress("UNUSED_CHANGED_VALUE")
    println("Vocal :${vocal--}")
}