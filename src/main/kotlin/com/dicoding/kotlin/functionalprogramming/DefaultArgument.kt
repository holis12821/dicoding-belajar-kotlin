package com.dicoding.kotlin.functionalprogramming

class DefaultArgument {

    fun getFullName (
        first: String = "Kotlin",
        middle: String = "is",
        last: String = "Awesome"
    ): String = "$first $middle $last"

}

fun main() {
    val defaultArgument = DefaultArgument()
    println(defaultArgument.getFullName(first = "Dicoding"))
}