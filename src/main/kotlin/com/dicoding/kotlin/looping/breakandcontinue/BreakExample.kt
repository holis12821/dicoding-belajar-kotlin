package com.dicoding.kotlin.looping.breakandcontinue

fun main() {
    val listOfInt: List<Int?> = listOf(1,2,3, null, 5, null, 7)

    for (i in listOfInt.indices) {
                                    /*fix sudah pasti nilainya tdk null atau ada nilainya*/
        val jumlahArray = listOfInt[2]?.let {
            listOfInt[1]?.plus(it)
        }
        println(jumlahArray)
    }

    /*menyebabkan kotlin nullPointerException*/
    nullPointerException()
    /*output berpotensi menyebabkan nulPointerException
    saat kita ingin mengelola nilainya tersebut*/

    continueNullable()
    breakNullable()
    loopingWithLabels()
}

fun nullPointerException() {
    val listOfInt: List<Int?> = listOf(1,2,3, null, 5, null, 7)

    for (i in listOfInt.indices) {
        val jumlahArray = listOfInt[3]?.plus(listOfInt[5]!!)
        println(jumlahArray)
    }
}

fun continueNullable() {
    val listOfInt: List<Int?> = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
}

fun breakNullable() {
    println()
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
        println()
    }
}

fun loopingWithLabels() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside loop")
            if (j > 5) break@loop
        }
    }
}