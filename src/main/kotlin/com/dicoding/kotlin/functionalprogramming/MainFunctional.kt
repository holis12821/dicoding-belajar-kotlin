package com.dicoding.kotlin.functionalprogramming

import com.dicoding.kotlin.model.UserData

fun main() {
    listUser()

    val list2 = getUserMap()
    for (i in list2) {
        println(i.name)
        println(i.age)
    }
}


fun listUser() {
    val list = getListUser()
    for (i in list) {
        println(i.name)
        println(i.age)
    }
}

fun getListUser(): List<UserData> { //akan merefers elemen ke interface mutable list
    //karena interface mutable list turunan dari interface list
    //jadi superclass di referensikan ke dalam subclassnya / nilainya
    val name = mutableListOf<UserData>()
    val userData = UserData("Nurholis", 21)
    name.add(userData)
    //tipe generiknya yg aka diberikan ke dl variabel i
    for (i in name) {
        name.clear()
        name.add(i.copy(name = "Johar", age = 21))
    }

    return name
}

fun getUserMap(): List<UserData> {
    val name = mutableListOf<UserData>()
    val userData = UserData("Johar", 22)
    name.add(userData)
    return name.map {
        it.copy(name= "Nurholis", age = 21)
    }
}