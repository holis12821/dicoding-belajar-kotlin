package com.dicoding.kotlin.whenexpression

import com.dicoding.kotlin.enumeration.ColorEnum
import kotlin.random.Random

class WhenExpression {
    val color by lazy {
        when(ColorEnum.BLUE) {
            ColorEnum.GREEN -> "Color is GREEN"
            ColorEnum.BLUE -> "Color is BLUE"
            ColorEnum.RED -> "Color is RED"
        }
    }

    fun value() {
      val stringOfValue =  when(7) {
            6 -> "value is 6"
            7 -> "value is 7"
            8 -> "value is 8"
           else -> "value cannot be reached"
        }
        println(stringOfValue)
    }

    fun valueCurlyBranch() {
        println()
        val stringOfValue = when(7) {
            6 -> {
                println("Six")
                "value is 6"
            }
            7 -> {
                println("Seven")
                "value is 7"
            }
            8 -> {
                println("Eight")
                "value is 8"
            } else -> {
                println("undifined")
                "value connot be reached"
            }
        }
        println(stringOfValue)
    }

    fun valueIsOf() {

        when(val anyType: Any =  100L) {
            !is String -> println("the value has a String type")
            is Long -> println("the value has a long type : $anyType")
            else -> println("undefined")
        }
    }

    fun valueCheckRange() {
        val value = 10
        val ranges =  10..50

        when(value) {
            in ranges -> println("value is in the range")
            !in ranges -> println("value is outside the range")
            else -> println("value undefined")
        }
    }

    fun valueRegisterNumber() {
        val registerNumber = when(val regis = getRegisterNumber()) {
            in 1..50 -> 50 * regis
            in 51..100 -> 100 * regis
            else -> regis
        }

        println(registerNumber)
    }

    private fun getRegisterNumber(): Int {
        /*mendapatan nilai random dari Random class*/
        /*method next int akan mendapatkan nilai int yg acak berikutnya*/
        val random = Random.nextInt(0, 12)

        for (i in arrayOf(random)) {
            println("Bilangan Random : $i")
        }
        return random
    }

    fun ifExpression() {
        val anyType: Any = 100L
        if (anyType is Long) {
            println("the value has a Long type")
        } else {
            println("the value is not Long type")
        }
    }

    fun whenExpression() {
        val anyType: Any =  100L
        when(anyType) {
            is Long -> println("the value has a Long type")
            is Int -> println("the value has a Int type")
            is Double -> println("the value has a Double type")
            else -> println("undifined")
        }
    }

    fun sum(value1: Int, value2: Int) = value1 + value2
}