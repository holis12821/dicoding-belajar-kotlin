package com.dicoding.kotlin.functionalprogramming

/*Powered by Nurholis all right reserved*/

/** Class StringBuilder digunakan untuk membuat objek string yang mutable
 * sama seperti class StringBuffer
 * perbedaan utamanya terletak pada sinkronisasi, sehingga StringBuilder
 * ini tidak thread safe karena tidak di sinkonisasi
 * digunanakan untuk memanipulasi string yg membutuhkan banyak objek string
 * sehingga kalo menggunakan objek string saja memakan banyak memori
 * atau berkas sampah atau gerbage di dalam memori oleh karena itu kita
 * membutuhkan class ini untuk memanipulasi string yang mutable*/

fun main() {

 val messaage = buildString {
     append("Hello") /*digunakan untuk kita menambahkan sebuah
     nilai string baru atau objek string baru*/
     append("form")
     append("lamda")
     /**
      * keyword this pada lamda akan merujuk ke objek stringBuilder saat ini
      * berti objek stringBuilder yg sudah kita instance
      * karena tdk terdapat parameter pada lamdanya jdi sebenarnya lamda ini merujuk
      * ke receivernya yaitu string builder dengan bantuan keyword this.
      * oleh karena itu kita bisa mengakses context yang ada pada string builder
      * seperti properti dan function dllnya
      * */

     /**
      * keyword this akan merujuk ke objek saat ini
      * atau disebut sebgaai reveiver objek
      * karena receiver objek yg mengakses ekstension function berupa lamda
      * jadi keyword this di body lamda ekspression merujuk ke objek saat ini
      * yaitu StringBuilder karena class StringBuilder sebagai receiver
      * menambahkan ekstension function berupa lamda dan di instance menjadi
      * sebuah objek yaitu sebagai receviver objek berarti memiliki anggota kan
      * yaitu ekstention functionnya berupa lamda oleh karena itu di blok lamda itu
      * kita bisa mengakses context objek dari class StringBuilder karena objek
      * sat ini merupakan class string builder
     */

     /*ini hanya mengakses objeknya saja atau
     * merujuk ke objeknya saja
     * jadi tdk mereturn apa"*/
     /*biasanya digunakan untuk mengakses member"objek
     * atau untuk inisialisasi objek*/


 }

  println(messaage)

 val result = intResult {
     /*ini digunakan untuk inisialisasi sebuah objek*/

 }


  val action = stringAction {

  }
    var i = 1
    println(i)
    i = 2
    println(i)


    val stringBuilder = StringBuilder()
    stringBuilder.buildString {

    }
}

fun StringBuilder.buildString(action: StringBuilder.() -> Unit): String {
    /*receiver type menambahkan sebuah tipe data deklarasi yaitu function
    * type untuk tipe data sebuah parameter
    * karena function stype tu berhubungan dengan lamda
    * karna lamda adalah bentukannya dri function type*/
    val stringBuilder = StringBuilder()
    action()
    return stringBuilder.toString()

}

fun intResult(action: Int.() -> Unit): Int {
    val value = 12
    value.action()
    return value / 2
}

fun stringAction(
    action: StringBuilder.() -> Unit
): String {
   val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}