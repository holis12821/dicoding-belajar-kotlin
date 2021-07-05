package com.dicoding.kotlin.list

fun main() {
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    list.forEach {
        if (it == 3) {
            println(it)
            return@forEach
        }
    }
}

/**
 * kalo menggunakan block forEach dan melampirkan return dan melebel ke forEach sebenarnya dia
menggunakan nama dari sih forEachnya tempat dia bernaung karna dia sebuah fungsi tanpa  nama atau lamda atau anonymous
jadi mereturn nya itu melebel ke lamda sebenarnya tetapi menggunakan nama dari fungsi forEach karena
lamda tdk memiliki nama alias anonim.

jika dia di dalam block if key word return ini akan keluar dari lamda exspression yg melebel ke forEach
yaitu menggunakan nama dari forEach karna lamda tidak memiliki nama. ketika keluar dari block lamda
maka sebenarnya kondisi ifnya ini tidak dijalankan kembali karna keluar dari lamdanya tersebut. makanya
outputnya hanya 3 jika  i == 3*/