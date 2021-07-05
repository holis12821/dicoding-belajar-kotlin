package com.dicoding.kotlin.oopnew


fun main() {
    /*val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: NullPointerException) {
        someMustNotNullValue = "Nilai String Null"
        someMustNotNullValue.toInt()
    } finally {
        println(someMustNotNullValue)
    }*/

    multipleCatch()
}


fun multipleCatch() {
    val someStringValue: String? = null
    var someIntValue = 0
    someIntValue.apply {  }

    someIntValue = try { //try catch itu adalah sebuah expression
        //karena bisa mengembalikan nilai seperti if expression dan when expression
        someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        0
    } catch (e: NumberFormatException) {
       -1
    }
    finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
    println(someIntValue)
}
