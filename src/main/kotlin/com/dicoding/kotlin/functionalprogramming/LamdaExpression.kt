package com.dicoding.kotlin.functionalprogramming

fun main() {
    //jika kita mendeklarasikan lamda tanpa mendefinisikan tipe data nya
    // yaitu function type maka type inference kotlin secara otomatis
    //membuatkan sebuah function type sebagai tipe data untuk sebuah variabel
    //yg menampung atau menyimpan sebuah lamda yg akan dijadikan fungsi ketka dipanggil
    //dan mendefinisikan parameter actualnya
    val message = {println("Hello from lamda")}
    message()

    val printMessage = {message1: String -> println(message1)}
    printMessage("Hello World")

    val messageLength = {message2: String -> message2.length}

    //val sum = { value: Int -> value + value}

    println("Panjang String : ${messageLength("Nurholis")}")
    //println("Hasil : ${)}")

    //printResult(10, sumElement, )

    printResult(10, sumElement) { world ->
       println("Hello : $world")
    }

}



val sumElement = { value: Int -> value + value}

fun printResult(value: Int, sumElement: (Int) -> Int, stringTampil: (String) -> Unit) {
    /*kita bisa mendefinisikan lamda ekspression jika posisi function typenya itu berada
    * di posisi parameter paling terakhir
    * jika dibelakangnya terdapat parameter walaupun function type dan function biasa kita tdk bisa mendefinisikan
    * lamda expression, kita hanya bisa mendefinisikan seperti melampirkan argumen seperti biasa*/
    val result = sumElement(value)
    val helloResult = stringTampil("World")
    println(helloResult)
    println(result)


}

/*untuk mendeklarasikan lamda expression kita tidak perlu menentukan tipe kembliannya
* secara eksplisit, karna sebenarnya jika kita menentukan tipe data kembalian yang akan menentukan
* nilai apa yang akan dikembalkan dri sebuah fungsi dan keyword return yang digunakan
* untuk mengembalikan nilainya pada sebuah fungsi, jadi kita tdk perlu penuliskan itu karna sudah kita definisikan
* pada function type yg dijadikan sebagai tipe data untuk variabel atau lamda ekspresion karna nantinya lamda tersebut
* akan ditampung di dalam variabel atau di dalam parameter yg dilampirkan pada sebua argument yg disebut
* heigher ordered function*/