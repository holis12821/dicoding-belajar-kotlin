package com.dicoding.kotlin.functionalprogramming

class NamedArgument {
    fun getFullName(
        first: String,
        middle: String,
        last: String): String = "$first $middle $last"
}


fun main() {
    val namedArgument = NamedArgument()
    println(
        namedArgument.getFullName(
            first = "Nur",
            last = "Lis",
            middle = "Ho"
        ))
}