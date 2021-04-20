package com.dicoding.kotlin.main

import com.dicoding.kotlin.whenexpression.WhenExpression

fun main() {
    val whenExpression = WhenExpression()
    println(whenExpression.color)
    whenExpression.value()
    whenExpression.valueCurlyBranch()
    whenExpression.valueIsOf()
    whenExpression.valueCheckRange()
    whenExpression.valueRegisterNumber()
    whenExpression.ifExpression()
    whenExpression.whenExpression()

    whenExpression.sum(1, 1 * 4)

    val data = Data()
    println("Hasil : ${data.boolean()}")
}


class Data {
    fun boolean(): Boolean {
        println()
        if ("Data" == javaClass.simpleName) {
            println("Data adalah nama class")
            return true
        }

        return false
    }
}