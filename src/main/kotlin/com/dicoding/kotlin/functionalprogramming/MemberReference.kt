package com.dicoding.kotlin.functionalprogramming

/**
 * Member reference
 * jadi biasanya kan kita mendeklarasikan sebuah lamda dengan function type
 * jadi function type ini akan di instance dan instance nya adalah lamda
 * expression.
 * nah tipe data yg dilampirkan di argument atau parameter di function typenya
 * secara otomatis akan menjadi tipe data untuk lamda expression nya berserta tipe
 * kembalian yg kita deklarasikan juga akan menjadi tipe kembalian di lambdanya
 * jadi misal kita lampirkan 4 tipe data di function type secara otomatis
 * parameter dari lambda ekspresion memiliki 4 parameter
 *
 * intinya lamda ini adalah instancenya function type
 *
 * nah bagaimana jika kita melampirkannya secara terpisah
 * karna sebenarnya lamda ini dan function type ini saling dependency atau
 * ketergantungan. dimana kita define function type disitu kita
 * harus melampirkannya berupa lamda agar function type mendapatkan instanenya
 * berupa lamda.
 *
 * nah dengan membuat member reference dengan kotlin, kita bisa memisahkan
 * lambda expression menjadi fungsi tersendiri atau dalam arti fungsi
 * biasa ini yang kita deklarasikan menjadi sebuah lambda expression
 *
 * jadi kita menggunakan operator :: untuk merefverensikan fungsi biasa yg kita
 * jadikan sebagai lamda untuk digunakan sebagai instance dari function typenya*/

var message = "Kotlin"

fun main() {
    val sum: (Int, Int) -> Int = ::count
    println(sum(12, 12))
    referenceFunction()
    referenceExtension()

    //property reference
    /**
     * Selain digunakan untuk mereferensikan sebuah fungsi.
     * Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
     * Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti
     * nama, fungsi setter getter, dll. Contohnya seperti berikut.
     * */
     println(::message.name)
     println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}

fun count(
    valueA: Int,
    valueB: Int
): Int {
    return valueA + valueB
}

fun referenceFunction() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    for (i in evenNumbers) {
        print(i)
    }
}

fun isEvenNumber(number: Int) = number % 2 == 0


//extension function yg nantinya kita jadikan sebagai lamda untuk instance
//sih function typenya
fun Int.isEvenNumber1() = this % 2 == 0

fun referenceExtension() {
    val numbers = 1.rangeTo(10)
    //intinya argument dri sebuah fungsi filter
    //adalah lamda with argument (it) otomatis akan menampung
    //konteks objek berupa nilainya. jadi nilai yg dilampirkan
    //di parameter filter ini adalah elemen dri range nya nah secara
    //otomatis receiver objek int ini akan mendapatkan instance berupa nilai
    //yg dijadikan sebagai argument untuk parameter filter.
    //otomatis sudah mendapatkan objeknya Int ini
    //nah makanya receiver objeknya this ini merujuk ke nilai dri elemen range
    //jadi this menjadi elemen dri range.
    val evenNumbers = numbers.filter(Int::isEvenNumber1)
    println()
    println(evenNumbers)
}
