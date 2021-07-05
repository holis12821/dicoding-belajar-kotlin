package com.dicoding.kotlin.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L) //waktu yg dibutuhkan untuk
    //melakukan operasi contoh perhitungan
    return 50_000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75_000
}

/**
 * perbedaan antara fungsi launch dan asyn adalah
 * fungsi launch akan membuat sebuah coroutine baru yang mana
 * tidak akan mengembalikan hasil tetapi akan mengembalikan referensi
 * ke coroutines sebagai job yg nanti di tampung ke fungsi launch
 * yang nanti nya akan kita gunakan untuk membatalkan eksekusi
 *
 * sedangkan fungsi asyn digunakan untuk memulai atau membuat sebuah
 * coroutines baru yg mana akan mengembalikan hasil yaitu interface
 * differed yg akan disimpan atau ditampung di dalam interface differed
 * nilai ini dijadikan sebagai instance dari tipe parameter generic,
 * tetapi hasilnya dilihat dulu
 * apakah exception atau bukan. karena fungsi ini akan menangkap sebuah
 * exception yang dihasilkan oleh coroutine sehingga ketika yg di hasilkan adalah
 * exception kita harus siap menanganinya, jika bukan exception yaitu berupa hasil
 * maka untuk mengambil hasilnya kita menggunakan fungsi abstract yg terdapat
 * di interrface differed yaitu await()*/

fun main() = runBlocking {
    /*val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")*/

    // no async is a sequential coroutines
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    //with async
    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await().minus(capital.await())}")
    }

    println("Completed is $timeOne ms vs $timeTwo ms")

}

