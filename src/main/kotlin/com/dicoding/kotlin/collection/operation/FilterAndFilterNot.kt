package com.dicoding.kotlin.collection.operation


/**
 * jadi fungsi filter ini akan mengevaluasi selueruh item dengan melakukan sebuah iterasi
 * menggunakan iterator untuk menggeserr ke elemen berikutnya untuk di evaluasi dengan kondisi
 * jika terpenuhi maka melakukan looping dan elemen yg ingin di filter itu dimasukan ke interface list
 * jadi dengan adanya looping jadi ditelusuri semua elemennya dan dinamis karena ketika terpenuhi dengan looping
 * secara otomatis data yg terfilter ini akan masuk ke interface list
 *
 * ini untuk fungsi operation filter, filterNot dan map*/


/**
 * Iterable merupakan sebuah superclass dari sebuah collection yang
 * mana ketika kita ingin mengiterasi data padaa collection, maka kotlin
 * akan memanggil iterable dan akan melooping datan satu persatu dengan konsep destructuring objeknya
 * jadi objek elemen data dri collectionya akan dijadikan sebagai variabel pada looping fornya
 * dan variabel pada looping for nya tersebut akan menampung sebuah elemen data dri colelction*/


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

/**
 * untuk fungsi find ini dia akan mencari elemen berdasarkan kondisi yg diberikan
 * atau dalam arti dia  menggunakan iterator dan looping untuk bergeser dan  mencari elemen yg sesuai dengan kondisi
 * bedanya dengan filter dia melooping tetapi jika data nya dievaluasi dengan kondisi
 *  terpenuhi maka langsung mereturn nilainya ke dala fungsi tersebut,
 *  karena tipe datanya adalah element dri collectionnya.
 *  jdi jika ada data yg terpenuhi maka langsung di return ke dalam
 * fungsi  tersebut tanpa harus menunggu untuk mengevaluasi elemen berikutnya untuk di simpan di dlm list
 * baru di return ke dlm
 * fungsi filter yg bertipe interface list untuk menampung elemen yg sblmnya dimasukan ke dlm interface list
 * sebagai data hasil filterisasi*/

/**
 * jika kita tidak melampirkan lamda sebagai paramater untuk sebuah fungsi firstOrNull()
 * atau llastOrNull(), first() dan last() maka secara default akan mengambil data pada item pertama dan terakhir*/

/**
 * jika kita menggunakan lamda sebagai nilai yg akan kita lampirkan pada sebuah fungsi firstornull, find
 * dan lastOrNull, serta last maka item yg ada pada collection tidak diperdulikan urutan data nya
 * initinya yg terpenuhi dengan kondisi dialah yg akan dijadikan sebagai item atau data pertama
 * ganjil atau genap tergantung kondisi yg diberikan*/

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



