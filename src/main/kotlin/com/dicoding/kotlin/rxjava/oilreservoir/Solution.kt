package com.dicoding.kotlin.rxjava.oilreservoir

object Solution {
    fun collectOil(height: IntArray): Int {
        //maximum value
       var result = 0
       var i = 0
       var j = height.size-1

       var maxLeft = 0
       var maxRight = 0

       while (i < j){
           if (height[i] <= height[j]) {
               maxLeft = Math.max(maxLeft, height[i])
               result += maxLeft - height[i]
               i++
           } else {
               maxRight = Math.max(maxRight, height[j])
               result += maxRight - height[j]
               j--
           }
       }
        return result
    }
}