package com.dicoding.kotlin.oopnew

import com.dicoding.kotlin.oopnew.delegate.DelegateGenericClass
import com.dicoding.kotlin.oopnew.delegate.DelegateName

fun main() {
    //person
    val person = Person()
    person.name = "Dimas"
    println("nama Orang : ${person.name}")

    //hero
    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama pahlawan : ${hero.name}")
}


class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}