package com.dicoding.kotlin.oopnew

fun main() {
 val calculator = Calculator()
   println(calculator.add(12, 12.2))
   println(calculator.add(2.5, 2.2))
   println(calculator.add(6f, 7f))
   println(calculator.add(1, 2, 4))

   println(calculator.min(9, 2))
   println(calculator.min(17.2, 18.3))

}

class Calculator {
   fun add(value1: Int, value2: Double) = value1 + value2
   fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
   fun add(value1: Double, value2: Double) = value1 + value2
   fun add(value1: Float, value2: Float) = value1 + value2

   fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2 //if expression
   fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}