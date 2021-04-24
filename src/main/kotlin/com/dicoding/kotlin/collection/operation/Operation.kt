package com.dicoding.kotlin.collection.operation

fun main() {
    val numberList = listOf(1, 2, 3, 4, 6, 7, 8, 9, 10)
    //sequence list bersifat lazy operation / vertically operation
    numberList.asSequence().filter { it % 2 == 0
    }.map { it * 5 }.forEach { value ->
        println("Element filtering $value")
    }

    println()
    //list biasa
    //sifat eager operation or horizontally operation
    val listEager = numberList.filter { it % 2 == 0
    }.map { it * 4 }
    println(listEager)


    println()
    listSequence()
}


fun listSequence() {
    val list = (1..50).toList()
    list.asSequence().filter {
        println(it)
        it % 5 == 0
      }.map {
        println(it)
        it + it
      }.forEach {
          println("Iterasi ke $it")
    }
    println() //yg membedakan anatara sequance dengan collection
    println() //hanya pada evaluasi operasinya pada element
    //jika collection akan mengevaluasi secara keseluruhan
    //artinya ketika kita melakukan filter element collection maka semuanya akan dievaluasi
    //jika terpenuhi maka akan lanjut ke element berikutnya
    // atau mengevaluasi element berikutnya sampai selesai baru dapat hasil filterisiasinya

    //kalo sequance jika kita melakukan filter element collection kondisi yg terpenuhi saja lah
    //yg akan dievaluasi dan langsung mendapatkan element
    // filternya maka lanjut ke operasi selanjutnya yaitu map
    // jadi tdk akan mengevaluasi elementnya secara keseluruhan / lanjut ke operasi berikutnya
    //jadi saat terpenuhi atau kita butuh saja datanya maka akan lanjut ke operasi berikutnya
    //jadi seperti menumpukkan prosesnya

    //jadi filter itu seperti menjembatani kita untuk memaniplasi list
    //karena return valuenya adalah objek list
    val listNoSequence = (1..50).toList()
    listNoSequence.filter {
        println(it)
        it % 5 == 0
    }.map {
        println()
        println(it)
        it + it
    }.forEach {
        println("Iterasi ke $it")
    }

    println()
}

/*documentation
* jadi lamda expression filter mengembalikan objek list karena tipenya list
* yg mana nanti elemen yg sudah di filter tersebut atau memenuhi kondisi dari selekssi elemen
* maka elemen tersebut dimasukan ke dlm interface list dan dikembalikan
* ke lamda filter tersebut jadi menampung objek list baru hasil filterisasi
* setelah itu baru map yg merevers ke filter dan mengakses elemen" dari list
* yg diberikan ke dlm argumen atau predicate lamdanya lalu di operasikan
*
*  */

/*berbeda dengan sequance yg mana menjalankan evaluasi secara lazy
* jadi elemen yg kita butuhkan saja lah yg akan di ambil untuk masuk ke operasi berikutnya
* jadi elemen yg dibutuhkan maksudnya elemen yg sudah lulus seleksi atau kondisinya terpenuhi saat
* dilakukan filterisasi*/