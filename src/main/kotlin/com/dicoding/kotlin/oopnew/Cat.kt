package com.dicoding.kotlin.oopnew

class Cat(pName: String, //value parameter
          pWeight: Double,
          pAge: Int, pIsCarnivore: Boolean,
          private val furColor: String, //property
          private val numberOfFeet: Int
): Animal(pName, pWeight, pAge, pIsCarnivore)  {



    fun playWithHuman() {
        println("$name bermain bersama manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }

    fun color(): String {
        return furColor
    }

    fun numberOfFeet(): Int {
        return numberOfFeet
    }

}


fun main() {
    val dicodingCat = Cat(
        "Dicoding Miaw",
        3.2,
        2,
        true,
        "Brown",
        4)

    dicodingCat.playWithHuman()
    dicodingCat.name
    dicodingCat.age //property yg ad adi superclass nya bisa kita akses
    //di dalam superclassnya
    dicodingCat.weight
    dicodingCat.numberOfFeet()
    dicodingCat.color()
    dicodingCat.eat()
    dicodingCat.sleep()

}