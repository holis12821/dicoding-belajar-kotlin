package com.dicoding.kotlin.main

import com.dicoding.kotlin.model.UserData
import com.dicoding.kotlin.nodataclasses.DataUser

fun main() {
    val user = UserData("Nurholis", 21)
    val dataUser1 = DataUser("Nurholis", 21)
    val dataUser2 = DataUser("Nurholis", 21)
    println(dataUser1)

    val user2 = UserData("Nurholis", 21)
    val user3 = UserData("Dimas", 17)

    println(user.equals(user2))
    println(user.equals(user3))

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser2))


    println()

    val dataUserJavaClass = DataUsers()
    println("Apakah : ${dataUserJavaClass.javaClassTest()}")

    println("")
}




class DataUsers {

    fun javaClassTest(): Boolean {
        val user = DataUsers()
        val user2 = DataUsers()

        if (user.javaClass != user2.javaClass) {
            println("not same")
            return false
        }
        else if (user.javaClass == user2.javaClass){
            println("same")
            return true
        }

        return true
    }

}