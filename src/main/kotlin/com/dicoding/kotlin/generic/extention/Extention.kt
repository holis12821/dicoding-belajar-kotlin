package com.dicoding.kotlin.generic.extention


inline fun <T> T.get( block: (T) -> Int): Int {
    val list = listOf<Int>()
    return list[block(this)]
}