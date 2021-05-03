package com.dicoding.kotlin.functionalprogramming

/*keyword this bergantung pada objek mana kah yg
* di instance, dan objek tersebut adalah
* objek saat ini yg pertama kali dibuat dan dirujuk oleh this
* jadi setiap objek dibuat this akan merujuk ke objek tersebut*/



fun main() {
    val value: Int? = null
    value.slice
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0
