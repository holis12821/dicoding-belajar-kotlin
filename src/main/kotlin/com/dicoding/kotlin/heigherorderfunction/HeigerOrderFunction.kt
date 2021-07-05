package com.dicoding.kotlin.heigherorderfunction

val sum = {value: Int -> value + value}

fun main() {
    result(10) { value ->
        value + value
    }

    result(10, sum)


    result1({
        it + it
    }, 10)

    result1(sum, 10)


    result2({
        it + it
    }, {
        it * it
    })
}

/**
 * Konsep ini dinamakan sebagai Higher-Order Function, yaitu sebuah fungsi yang menggunakan
 * fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
 * Yang perlu diperhatikan adalah, jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
 * maka lambda expression tersebut ditempatkan di luar parenthesis seperti pada contoh kode di atas.*/

fun result(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

/**
 * jika function type yg dijadikan sebagai tipe data untuk sebuah paramater dari sebuah fungsi
 * jika dia berada di parameter pertama, ada di tengah atau dua-duanya paramaternya bertipe data function
 * type maka secara otomatis ketika kita melampirkan sebuah lamda ekspresion yg dijadikan nilai atau argumen
 * dari fungsi tersebut ketika kita panggil maka secara otomatis lamda ekspression ini akan kita lampikan di dalam
 * parenthesis dari sebuah fungsi dan tdk diluar*/

fun result1(sum: (Int) -> Int, value: Int) {
    val result = sum(value)
    println(result)
}

fun result2(sum1: (Int) -> Int, sum2: (Int) -> Int) {
     val value1 = 12
    val value2 = 14
    val result1 = sum1(value1)
    val result2 = sum2(value2)

    println(result1)
    println(result2)

}