package com.dicoding.kotlin.functionalprogramming.main

import com.dicoding.kotlin.functionalprogramming.commonfunction.*

fun main() {
    //TODO lamda with receiver (this) apply
    val stringBuilder = StringBuilder()
    stringBuilder.why {
        append("Hello")
        append("Kotlin")
    }
    println(stringBuilder)

    //TODO lamda with receiver (this) by

    val list = mutableListOf<String>()

    by(list) {
        add("Nurholis")
        add("Alfat yauma")
        add("Jaka")
    }

    for (i in list) {
        println("nama :  $i")
    }

    //TODO lamda with argument (it) same as also

    val string =  "Joko"
    string.what {
        val name = it
        println(name)
    }

    //TODO lamda with argument (it) same as let
    val value = 10
   value.permit {
        it + it
    }


 val result = execute {
        val value1 = 10
        val value2 =  12
     value1 + value2
    }

    println(result)

    val stringBuilder1 = StringBuilder()
    stringBuilder1.execute {
            
    }


}