package com.dicoding.kotlin.oopnew

fun main() {
    val dicodingCat = Hewan("Dicoding Miaw", 2.5, 2,true)
    println("""
        Nama : ${dicodingCat.name},
        Berat: ${dicodingCat.weight},
        Umur : ${dicodingCat.age}
        Mamalia : ${dicodingCat.isMammal}
    """.trimIndent())

    val dicodingBird = Hewan("Dicoding tweet", 0.5, 1)
    println("""
        Nama : ${dicodingBird.name},
        Berat: ${dicodingBird.weight},
        Umur : ${dicodingBird.age}
        Mamalia :  ${dicodingBird.isMammal}
    """.trimIndent())
}

//blok init itu sebenarnya block dari primary constructor
//karena primary constructor terbatas block, karena kita tdk bisa secara langsung
//membuatkan blocknya karena terhalang oleh block kelas
//maka kita definisikan di block terpisah yaitu init
class Hewan(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init{
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String,
                weight: Double,
                age: Int,
                isMammal: Boolean
    ): this(name, weight, age) { //turunan dari constructor primernya
        this.isMammal = isMammal
    }
}