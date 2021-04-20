package com.dicoding.kotlin.main

import com.dicoding.kotlin.enumeration.Color
import com.dicoding.kotlin.enumeration.ColorEnum

/*
  Enumeration merupakan  salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
   yang telah didefinisikan menjadi tipe data konstanta. Enumeration dapat ditetapkan sebagai nilai ke dalam
   sebuah variabel dengan cara yang lebih efisien. Selain itu, Enumeration juga dapat digunakan untuk
   meminimalisir kesalahan dalam pengetikan nilai sebuah variabel
   jadi objek yg di dalam kelas enumeration itu merupakan hasil instance
   dari class enumeration itu sendiri karena constructor untuk class enumerationnya
   itu private akses modifiernya jadi untuk kita menginstaance class enumnya
   kita instance di dalam class enumerationnya itu sendiri
*/

fun main() {
    /*access object Enum
    * objek enum ini dapat kita tetapkan sebagai nilai
    * yang dapat kita berikan ke dalam sebuah variabel*/

    val colorRed = Color.RED.enumRed()
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    val name = ColorEnum.RED.ordinal
    println("Name : $name")

     println(ColorEnum.RED.printValue())
     println(ColorEnum.GREEN.printValue())
     println(ColorEnum.BLUE.printValue())

    /*mendapatkan daftar objek enum dengan method
    values dan valueOf*/

    /*function value() and valueOf() */
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color\t")
    }
    println()
    val color = Color.valueOf("GREEN")
    println("Color is $color")

    println()
    /*function enumValues() dan enumValueOf()*/
    val  colorEnum: Array<Color> = enumValues()
    colorEnum.forEach { warna ->
        println(warna)
    }

    val enumColor = enumValueOf<Color>("RED")
    println("Color is $enumColor")

    /*penggunakan properti ordinal untuk mendapatkan posisi  dari
    tiap" objek ENUM*/

    val colorGreenEnum = Color.GREEN
    println("Position GREEN is ${colorGreenEnum.ordinal}")
}
