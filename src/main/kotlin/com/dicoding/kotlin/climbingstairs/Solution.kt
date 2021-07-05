package com.dicoding.kotlin.climbingstairs

object Solution {

    fun climbStairs(n: Int): Long {
        return when {
            n <= 1 -> 1
            n in 1..89 -> {
                climbStairs(n - 1) + climbStairs(n - 2)
            } //3-1 + 3 - 2 +
            //
            else -> -1
        }
    }
}