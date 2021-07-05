package com.dicoding.kotlin.functionalprogramming

import com.dicoding.kotlin.oop.Car
import com.dicoding.kotlin.oop.EngineElectric

fun main() {
  val result: Sum = {valueA, valueB -> valueA + valueB}
  println("Result : ${result(12, 12)}")

  println(sum.invoke(12,12))

  val engineElectric = EngineElectric()
  val car = Car(engineElectric)

  car.startEngine {
    it
  }

}


typealias Sum = (Int, Int) -> Int


val sum = {valueA: Int, valueB: Int -> valueA + valueB}


val stringWidth = {sentence: String -> sentence.length}



val angka = { valueA: Int, valueB: Int -> valueA + valueB}

/*predicate merupakan value parameter yg bertipe data function type yg hanya menampung atau menyimpan lamda expression atau
instancenya dari function type yg mana di lamda ekspression tersebut merupakan deklarasi sebuah function
* yang mendefinisikan paramter formal dari sebuah fungsi
* ketika kita ingin memanggil fungsinya cukup mengakses value parameternya dan akan menjadi sebuah function
* yg kita panggil seperti mendeklarasikan pemanggilan function dengan menuliskan parameter actual
* diikuti dengan melampirkan sebuah argumen jika ada di parameter actual tersebut
* jika lamda expressionnya ini mengembalikan nilai secara otomatis saat mengakses value parameter predicate
*  secara otomatis kita menuliskannya dalam pemanggilan sebuah fungsi dan return nilainya tersebut dri lamdanya
* akan di kembalikan pada fungsi predicate tersebut ditampung*/
fun Car.startEngine(predicate: (String) -> String ): String { /*Heigher Order Function*/
  return """${this.startEngine()}, 
    |${println(predicate.invoke("Car is Walked"))}""".trimMargin()
}