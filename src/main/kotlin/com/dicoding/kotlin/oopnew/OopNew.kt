package com.dicoding.kotlin.oopnew

fun main() {
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())

    val someString2 = "123"
    val someInt = someString2.toInt()
    println(someInt)
    val someOtherString = "12.34"
    val someDouble =  someOtherString.toDouble()
    println(someDouble)

    val animal = Animal1(
        name = "Kucing",
        weight = 12.5,
        age = 1,
        isMammal = true
    )

    println(animal)

    println("""
        ${animal.name},
        ${animal.weight},
        ${animal.age},
        ${animal.isMammal}
    """.trimIndent())

    animal.eat()
    println(someInt is Int)
    println(someDouble is Double)

    val dicodingCat = Animal2()
    //secara standart ketika properti pada sebuah kelas dibuat mutable,
    //maka kotlin akan menghasilkan fungsi getter dan setter pada properti tersebut
    //jika properti oada sebuah kelass dibuat read only, maka kotlin hanya
    //akan menghasilkan fungsi getter pada properti tersebut.

    println("Nama : ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("name: ${dicodingCat.name}")

}

class Animal1 (val name: String,
              val weight: Double,
              val age: Int,
              val isMammal: Boolean) {
    //define member class or anggota dari objek

    fun eat() {
        println("$name makan !")
        println("$name tidur !")
    }

    override fun toString(): String {
        return "Animal = $name, $weight, $age, $isMammal"
    }
}


class Animal2 {
    var name: String = "Dicoding Miaw"
    get() {
        println("Fungsi getter terpanggil")
        return field
    }

    set(value) {
        println("Fungsi setter terpanggil")
        field = value
    }
}





