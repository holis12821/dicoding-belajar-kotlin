package com.dicoding.kotlin.enumeration

enum class ColorEnum(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
           println("Value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value of BLUE is $value")
        }
    };

    abstract fun printValue()
}