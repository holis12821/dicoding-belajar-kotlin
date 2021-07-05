package com.dicoding.kotlin.functionalprogramming

import com.dicoding.kotlin.functionalprogramming.commonfunction.what
import com.dicoding.kotlin.functionalprogramming.commonfunction.why

class ListCommon {

    fun listData() {
        /**
         * this function used lamda with receiver (this)
         * */
        val list = mutableListOf<Int>()
        list.why {
            add(0, 1)
            add(1, 2)
            add(2, 3)
            add(3, 4)
        }


        for (i in list) {
            println("data ke $i")
        }
    }

    fun dataString() {
        val nameLanguage = "Kotlin"
        nameLanguage.what {
            println(it)
        }
    }
}