package com.dicoding.kotlin.climbingstairs

import java.util.*

fun main() {
  val dp  = Scanner(System.`in`)
  println("Berapa anak tangga yang kamu panjat : ")
  val n = dp.nextInt()
  println(Solution.climbStairs(n))
}