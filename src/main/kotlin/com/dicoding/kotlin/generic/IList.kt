package com.dicoding.kotlin.generic

interface IList<out T> {
    operator fun get(index: Int): T
}

interface IMutableList<T>: IList<T> {
    fun add(element: T): Boolean
}