package com.dicoding.kotlin.destructuring.declaration

import com.dicoding.kotlin.model.UserData

fun main() {
    val dataUser = UserData("Nurholis", 17)

    val name = dataUser.component1()
    val age = dataUser.component2()

    val (name1, age1) = dataUser
    println("My name is $name1, iam $age1 years old")
    println("My name is $name, iam $age years old")

    destructuring()
}

fun destructuring() {
    val dataUser = UserData("nrohmen", 21)
    val (name, age) = dataUser
    println("My name is $name, i am $age years old")
}
