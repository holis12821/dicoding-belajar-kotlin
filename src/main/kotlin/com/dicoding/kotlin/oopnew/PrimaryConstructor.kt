package com.dicoding.kotlin.oopnew

class PrimaryConstructor( name: String,
                          weight: Double,
                          age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    var isToxic: Boolean

    init {  //primary constructor dan block init harus saling terhubung
        //block ii digunakan untuk proses validasi dari sebuah
        //properti pada class sebelum di inisialisasi ke properti tersebut nilainya
        /*jadi di dalam block init ini kita dapat mengakses
        * value parameter yg ada di dalam primary constructor nya*/
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0 ) 0 else age
        this.name = name
        this.isMammal = false
        this.isToxic = false
    }

    constructor(name: String,
                weight: Double,
                age: Int,
                isMammal: Boolean ): this(name, weight, age) {
        this.isMammal = isMammal
    }

    constructor(name: String,
                weight: Double,
                age: Int,
                isMammal: Boolean,
                isToxic: Boolean ): this(name, weight, age) {

    }
}



fun main() {
    val dicodingCat = PrimaryConstructor("Dicoding Miaw",
        4.2, 2, false)

    println("""
        Nama : ${dicodingCat.name},
        Berat: ${dicodingCat.weight},
        Umur : ${dicodingCat.age}
        Mamalia : ${dicodingCat.isMammal}
    """.trimIndent())
}