package com.dicoding.kotlin.collection

fun main() {
    val collect = Collection()
    collect.list()
    collect.mutableList()
    collect.set()

    collect.map()
}


class Collection {

    fun list() {
        val numberList = listOf(1, 2, 3, 4, 5)
        for (i in numberList) {
            println(i)
        }
    }

    fun mutableList() {
        val anyList = mutableListOf('a', "Kotlin", 3, true)

        anyList.add('d') //menambahkan item di akhir list
        anyList.add(1, "Love") //menambah item pada index ke 1
        anyList[3] = false //mengubah nilai item pada index ke 3
        anyList.removeAt(6) /*menghapus item berdasarkan indexnya atau posisi
        // nilai di dalam array*/

        //menghitung panjang / ukuran / totol dari element yg ada di dlm list
        println("Total element : ${anyList.size}")

        for (i in anyList) {
            println(i)
        }
    }
    fun set() {
        val integerSetA = setOf(1, 2, 4, 2, 1 , 5)
        val integerSetB = setOf(1, 2, 4, 5)

        println(integerSetA)
        println(integerSetB)

        println(integerSetA == integerSetB)

        println(5 in integerSetA)

        for (i in integerSetA) {
            if (i % 2 == 0) {
                println("Set ke - $i")
            }
        }

        val union = integerSetA.union(integerSetB)
        val intersect = integerSetA.intersect(integerSetB)

        println(union)
        println(intersect)
    }

    fun map() {
        val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
        )
        //perbedaan dengan method get dan getValue
        //get karna dia bertipe nullable untuk tipe data valuenya
        //maka jika nilai valuenya null maka akan aman dri null pointer

        //untuk getValue dia akan menampilkan exception jika key yg kita inginkan
        //tdk ada di dalam map
        println("Ibukota Jakarta : ${capital["Jakarta"]}")
        println("Ibukota London : ${capital.getValue("New Delhi")}")

        //menampilkan key yg ada pda map dengan fungsi key
        println("Key dlm map ${capital.keys}")
        //menampilkan nilai yg ada pada map dengan fungi values
        println("Nilai dlm map  ${capital.values}")

        capital.forEach { (ibukota, negara) ->
            println("Ibukota $ibukota, merupakan ibukota dari negara $negara")
        }
        println()

        for ((ibukota, negara) in capital) {
            println("Ibukota $ibukota, merupakan ibukota dari negara $negara")
        }
        println()
        //converted map to mutableMap
        val mutableMapCapital = capital.toMutableMap()
        mutableMapCapital["Amsterdam"] = "Netherlands"
        mutableMapCapital["Berlin"] = "Germany"
         mutableMapCapital.forEach { (ibukota, negara) ->
             println("Ibukota $ibukota merupakan ibukota dari negara $negara")
         }

    }

}