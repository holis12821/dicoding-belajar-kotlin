package com.dicoding.kotlin.generic

import com.dicoding.kotlin.generic.extention.get
import java.util.ArrayList

class MutableLongList: IMutableList<Long> {
    override fun get(index: Int): Long {
       return index.toLong()
    }

    override fun add(element: Long): Boolean {
        return when(element) {
            element -> true
            else -> false
        }
    }


}

fun main() {
   val mutableLongList = MutableLongList()
    mutableLongList.add(10L)
    mutableLongList.add(11L)

    println(mutableLongList[0])
}







