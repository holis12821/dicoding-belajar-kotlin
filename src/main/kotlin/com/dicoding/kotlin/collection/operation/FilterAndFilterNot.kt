package com.dicoding.kotlin.collection.operation

fun main() {
    val numberList = listOf(1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10)
    val eventList = numberList.filter {
        println(it) //jadi collection ini sifatnya eager
        //jadi harus di evaluasi secara keseluruhan dulu walau kondisinya terpenuhi
        //dan akan lanjut kan element berikutnya
        //jadi seperti ditandai terlebih dahulu jika elemennya tersebut
        //memenuhi seleksi dari filterisasi
        //setelah itu jika ada yg terpenuhi kondisi dari filternya akan di return
        //element list ke variabel event list yg sudah di filter, evaluasi element kembali kondisi
        //jika terpenuhi mereturn interface list yg berisi element yg sudah di seleksi (kondisi terpenuhi) ke filter
        // dan diberikan ke variabel event list
        println()
        it % 2 == 0
    }
    println(eventList)

    println()
    println()
    filterNot()

    println()
    mapping()
    count()


    println()
    find()
    println()
    first()
    println()
    firstOrNull()
    lastOrNull()
    last()
    sum()
    println()
    sortedAscending()
    sortedDescending()
}


fun filterNot() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val notEventList = numberList.filterNot { it % 2 == 0 }
    println(notEventList)
}

/*Fungsi yang akan sering dipakai berikutnya adalah map().
Fungsi ini akan membuat collection baru sesuai perubahan yang
akan kita lakukan dari collection sebelumnya. Kita ambil contoh dari numberList
yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari
masing-masing item. Maka Anda bisa menggunakan kode seperti berikut:*/

fun mapping() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)
}

fun count() {
    println()
    //count list
    val numberList = (1..10).toList()
    println(numberList.count())
    println()
    println(numberList.count {
        it % 3 == 0
    })
}

fun find() {
    println("Find")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }

    println(firstOddNumber)
}

fun firstOrNull() {
    println("First or null")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val firstOddNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOddNumber)
}

fun lastOrNull() {
    println("Last or null")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val firstOddNumber = numberList.lastOrNull { it % 2 == 0}
    println(firstOddNumber)
}


fun first() {
    println("First")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val moreThan10 = numberList.first { it % 2 == 1 }
    println(moreThan10)
}

fun last() {
    println("Last")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val moreThan10 = numberList.last { it % 2 == 0 }
    println(moreThan10)
}

fun sum() {
    println("Sum")
    println()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10)
    val total = numberList.sum()
    println(total)
}

fun sortedAscending() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n' )
    val ascandingSort = kotlinChar.sorted()
    println(ascandingSort)
}

fun sortedDescending() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}



