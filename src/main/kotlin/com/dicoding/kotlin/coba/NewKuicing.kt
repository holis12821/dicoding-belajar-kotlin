package com.dicoding.kotlin.coba

import com.dicoding.kotlin.common.Kucing

class NewKucing: Kucing() {
    fun grooming() {
        println("Meong")
    }
}


fun main() {

   // val kucing: Kucing = NewKucing()
    val kucing: Kucing = NewKucing()

    kucing as NewKucing
    kucing.grooming()

    val door = Door()
    door.printGood()
}


open class Good {
   fun good() {
       println("good")
   }
}


class Door: Good() {
    fun printGood(){
        println("value $this")
    }

    override fun toString(): String {
        return "Door"
    }
}