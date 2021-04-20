package com.dicoding.kotlin.reflection

fun main() {
    val reflect1 = Reflect("Nurholis", 21)
    val reflect2 = Reflect("Nurholis", 21)
    println("Hasil : ${reflect1.reflect(reflect2)}")

  println("""
       Alamat objek 1 $reflect1
       Representasi alamat objek 1 ${reflect1.hashCode()}
       Alamat objek 2 $reflect2
       Representasi alamat Objek 2 ${reflect2.hashCode()}
       
       Hasil HashCode Objek1 : ${reflect1.hashCodeReflect()}
       Hasil HashCode Objek2 : ${reflect2.hashCodeReflect()}
  """.trimIndent())
}

/*jka kita membandingkan sebuah objek dengan equals maka secara default akan selalu
* bernilai false mengapa demikian karena secara default objek yg kita buat dari class A misal
* dan objek yg kita buat lagi dari class B, masing-masing objek ini merupakan 2 objek yg berbeda
* karena alamat memory mereka  class Reflect() pertama di alamat memory A untuk objek A
* sedangkan ketika kita buat objeknya lagi dari class Reflect juga nah class Reflect tersebut
* berada di alamat memory B untuk objek B */

class Reflect (
    private val name: String,
    private val age: Int
    ) {

    fun reflect(other: Any?): Boolean {
        if (this == other) {
            println(javaClass)
            return true /*jika terpenuhi return true ke fungsi reflect*/
        }
        if (javaClass != other?.javaClass) return false
        /*jika tdk terpenuhi / false return false ke fungsi reflect dan keluar dri blok fungsi*/

        other as Reflect

        if (name != other.name) return false
        if (age != other.age) return false

        return true /*ini sebagai opsi jika tdk ada kondisi yg terpenuhi diatas*/
    }

    fun hashCodeReflect(): Int {

      var result = name.hashCode()
      println("result : $result")
      result = result.let {
          it + 31 + age
      }

      return result
    }
}