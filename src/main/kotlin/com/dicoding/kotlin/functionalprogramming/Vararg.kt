package com.dicoding.kotlin.functionalprogramming

fun main() {
    println(
        getUserName(
            name = "Nur",
            middle = "Ho",
            last = "Lis"
        )
    )

    getUserNameWithVararg("Nur", "Ho", "Lis")

    val number2 = intArrayOf(10, 20, 30, 40)

    val number = sumNumbers(10, 20, *number2 ,30, 40)
    println(number)

    val list = asList(1,2,3,4,5,6,7,8)
    for (i in list) {
        println(i)
    }

  val setElement =  sets(5, 1, 2, 3, 4, 5)
    println()
  if (setElement != null) {
      for (i in setElement) {
          println("Element Array : $i")
      }
  }

    setsArgument(1,2,3,4,5, name = "Holis")

}

fun setsArgument(vararg number: Int, name: String): Int {
    return number.size
}


fun getUserName(name: String,
                    middle: String,
                    last: String): String = "$name $middle $last"


fun getUserNameWithVararg(vararg name: String){
    for (i in name) {
        print(i)
    }
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun <T> asList(vararg  input: T): List<T> {
    val result = ArrayList<T>()
    for (i in input)
        result.add(i)
    return result
}

fun <T> sets(size: Int, vararg number: T): List<T>? {
    val result = arrayListOf<T>()
    if (size == number.size) {
        println(number)
        for (i in number) { //di looping for kita melakukan
            //destructuring objek atau memetakan objek
            result.add(i)
        }
        return result
    }
    return null
}
