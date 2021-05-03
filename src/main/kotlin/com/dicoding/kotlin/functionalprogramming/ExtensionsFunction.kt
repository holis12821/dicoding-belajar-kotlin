package com.dicoding.kotlin.functionalprogramming

fun Int.printInt() {
    println("value $this")
}


fun main() {
    10.printInt()
    println(11.plusThree())

    val element = ArrayList<Int>().printlnArrayListOf(5, 1, 2, 3, 4, 5)
    for (i in element) {
        println("Element ke $i")
    }

    10.result()
}

/*ekstension merupakan sebuah fitur dari kotlin
* yg dapat membuat perluasan fungsionalitas dari sebuah class
* tanpa harus menginherid atau membuat class baru untuk memperluas fungsionalitasnya
* dengan membuat function baru di class  perluasannya/ class baru tersebut
* ini digunakan jika class yg ingin diperluas sudah final atau berasal dari third party library
* oleh karena itu kita tetap bisa melakukan perluasan fungsionalitas (membuat sebuah class baru yg masih berhubungan dengan
* superclassnya tetapi berbeda) pada classnya dengan cara
* mendefinisikan ekstension function */

fun Int.result()  = this /*
jika ekstension function kita boleh tdk mendefinisikan
tipe kembaliannya untuk ekstensi fungsimya secara eksplisit
karena secara otomatis sudah ditentukan oleh kompiler kotlin
melalui type inference*/


fun Int.plusThree(): Int = this + 3

//exstension function
//jadi kita tdk perlu membuat class baru yg inherid atau mewarisi
//karena sebenarnya class baru ini merepresentasikan class induknya y
//ingin membuat fungsi baru
///penambahan fungsi baru sebenarnya untuk memperluas fungsionalitas
//dari class supper nya
//jadi intinya untuk memperluas fungtionalitas kelas dengan menambahkan fungsi baru
//pada sebuah class yg baru yg inherit ke class yg ingin diperluas fungsionalitasnya
//jika kita tdk ingin demikian kita bisa menggunakan ekstensio function
// class yg ingin menambahkan sebuah fungsi baru atau propery baru
// untuk memperluas fungsionalitasnya
//cukup menggunakan ekstension funtion
fun <T> ArrayList<T>.printlnArrayListOf(size: Int, vararg element: T ): List<T> {
    //destructuring objek for array with indexing
    //so kita menguraikan atau memecahkan objek menjadi
    //2 varibel yaitu index dan value
    if (element.isEmpty() || element.size == size) {
        for (i in element) {
            this.add(i)
        }
    }
    return this //this ini akan merujuk ke objek saat ini
    //yg mengakses atau memanggil properti atau method yg dimiliki objek sersebut
}
