package com.dicoding.kotlin.functionalprogramming.functioninsidefunction

fun main() {
    setWord("Otten Coffee")
   println(sum1(12, 12, 12))
   println(sum2(12,12,12))
   println(sumExtension(13,13,13))
    sum2(13,13,13)

}


//inner function
fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}

fun sum1( valueA: Int,
          valueB: Int,
          valueC: Int
): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }

    if (valueC == 0) {
        throw IllegalArgumentException("valueC must be better than 0")
    }

    return valueA + valueB + valueC
}

fun sum2(
    valueA: Int,
    valueB: Int,
    valueC: Int
): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)
    return valueA + valueB + valueC
}


//inner function with extension function
fun sumExtension(
    valueA: Int,
    valueB: Int,
    valueC: Int
): Int {
    fun Int.validateNumber() {
        if (this == 0) throw IllegalArgumentException("value must be better than 0")
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

