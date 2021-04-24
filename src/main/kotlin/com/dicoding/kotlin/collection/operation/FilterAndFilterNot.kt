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

    println()
    //count list  
    println(numberList.count())
    println()
    println(numberList.count {
        it % 3 == 0
    })
}