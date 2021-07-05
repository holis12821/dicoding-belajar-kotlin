package com.dicoding.kotlin.minimumpathsum

fun main() {
    val number = Solution.minimumPathSum(arrayOf(
        intArrayOf(1, 2, 1, 9),
        intArrayOf(1, 5, 1, 1),
        intArrayOf(4, 2, 1, 1))
    )
    println(number)
}