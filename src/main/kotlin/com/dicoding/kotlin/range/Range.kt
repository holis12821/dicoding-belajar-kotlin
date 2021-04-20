package com.dicoding.kotlin.range

fun main() {
    rangeToInt()
    rangeInTo()
    characterRange()

    /*for looping*/
    forLooping()
    forLoopingWIthIndex()
    forEachLooping()
    forEachIndexedLooping()

    forNested()
    lamda()
}

fun rangeToInt(){
    val rangeInt = 7.downTo(1) step 2

    rangeInt.forEach {
        println("$it")
    }
    println()
    println(rangeInt.step)
}

fun rangeInTo(){
    val tenToOne = 10 downTo 1
    if (11 !in tenToOne) {
        println("No value 11 available")
    }
}

fun characterRange() {
    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach { character ->
        println("Character : $character")
    }

    println("Step character = ${rangeChar.step}")
}

fun forLooping() {
    println()
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges) {
        println("value is $i!")
    }
}

fun forLoopingWIthIndex() {
    val range = 1.rangeTo(10) step 3
    for ((index, value) in range.withIndex()) {
        println("value $value with index $index")
    }
}

fun forEachLooping() {
    println()
    val range = 1.rangeTo(10) step 3

    range.forEach { value ->
        println("value is $value!")
    }
}

fun forEachIndexedLooping() {
    println()
    val ranges = 1.rangeTo(10) step 3

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

fun forNested() {
    println()
    val range = 1.rangeTo(5)

    for (i in range) {
        for (j in range) {
            println("Nilai $i and $j")
        }
    }
}

    fun lamda() {
        println()

        val name = "Nurholis"

        val countCharacterName = name.let {
            "Name : $it" /*ini tdk akan pernah di return
        atau di kembalikan ke dalam variabel*/
            return@let
        }

        println("length Name : $countCharacterName")
    }




