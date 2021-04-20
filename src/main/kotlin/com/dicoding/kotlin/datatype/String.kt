package com.dicoding.kotlin.datatype

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]
    print("First character of $text is $firstChar")

    /*call function*/
   iterasiIndexingString()
    iterasiString()
    escapedString()
    array()

    getElementString()
}

fun iterasiIndexingString(){
    val text = "Kotlin" /*string berisi kumpulan karakter*/
    //di dlm kumpulan karakter tersebut sebenarnya berbentuk array
    /*jadi bisa kita buat looping dengan data string karena terdapat index nya*/
    for (char in text.indices){
        println()
        print("${text[char]}")
    }
}

fun iterasiString(){
    println()
    val text = "Kotlin"
    for (char in text) {/*yg diberikan ke
    variabel char dri text adalah masisng-masing
    karakter dari kalimat kotlin*/
        println()
        print("$char")
    }
}

fun escapedString(){
    val name = "Unicode test: \u00A9"
    print(name)
    println()
}

fun array(){
    val intArray = Array(4) { i -> i * i } /*index dimulai dri 0 -> i = 0
    jadi i ini akan mendapatkan nilai dari hasil kali index*/
    for (i in intArray){
        println("index ke : $i")
    }
}

fun getElementString(){
    val name= "Kotlin"
    println("name : ${name.length}") /*jadi properti length
    nya itu tdk akan dijalankan atau dilewatkan prosesnya oleh compiler atau ketika objek memanggil method
    maka methodnya tdk akan di proses atau di eksekusi*/
}
