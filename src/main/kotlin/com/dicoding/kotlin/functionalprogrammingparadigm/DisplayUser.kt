package com.dicoding.kotlin.functionalprogrammingparadigm

object DisplayUser {

    fun getListUser(): List<User> {
        val list = mutableListOf<User>()//implementation of MutableList with arrayList
        val user = mutableListOf(
            User(name = "Nurholis", age = 21, address = "Jl. Baiduri Bulan No. 8A"),
            User(name = "Agus", age = 22, address = "Jl. Pasangrahan Timur No 7"),
            User(name = "Julia", age = 22, address = "Jl. Pasangrahan Timur No 7")
        )
        list.addAll(user)
        return list
    }

}