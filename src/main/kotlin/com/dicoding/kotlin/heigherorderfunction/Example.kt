package com.dicoding.kotlin.heigherorderfunction

fun main() {
    val getListLamda = getLamdaList()
    for (i in getListLamda) {
        println(i("Nurholis"))
    }


    println(
        //getReturnFunction()("Nurholis")
        getReturnFunction().invoke("Nurholis")
    )


    val sum = {value: Int -> value + value}
    println(sum(12))

}


//konsep heigher order function yg mana menjadikan sebuah list yg menampung sebuah
//fungsi

fun getLamdaList(): List<(String) -> String> {
    val list = mutableListOf<(String) -> String>()
    list.add {name -> "name : $name"}
    return list
}

//ini adalah konsep pemanggilan fungsi
//yg menerapkan heigher order function sebagai return type untuk sebuah function
fun getReturnFunction(): (String) -> String {
    return {
        "name: $it"
    }
}


