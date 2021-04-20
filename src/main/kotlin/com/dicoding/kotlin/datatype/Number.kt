package com.dicoding.kotlin.datatype

fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)
    /*over range data type Int*/
    overRangeInt()

    toInt()
    safeCalls()
    stringTemplate()
}

fun overRangeInt() {
    val maxInt = Int.MAX_VALUE
    val rangeOverInt = Int.MAX_VALUE /*this operation has led to an overflow*/

    println("Max Int : $maxInt")
    println("Over range Int : $rangeOverInt") /*jadi minimal nilai yg diambil*/
}

fun toInt(){
    val stringNumber = "23"
    val intNumber = 3
    println("Hasil : ${intNumber + stringNumber.toInt()}")
}

fun safeCalls(){
    val text: String? = null
    val textLength =  text?.length ?: 7
    println(textLength)
}

fun stringTemplate(){
    val hour = 7
    println("Office ${if (hour > 7) "Alredy Close" else "is Open"}")
}
