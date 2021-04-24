package com.dicoding.kotlin.main

import com.dicoding.kotlin.common.Hewan
import com.dicoding.kotlin.common.Kucing
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val hewan: Hewan = Kucing()

    println("Kucing berwarna : ${hewan.color}")
    println("Tinggi : ${hewan.height}")
    println("Berat awal : ${hewan.weight}")
    println(hewan.eating())


    val scannerIn = Scanner(System.`in`)
    print("Masukkan Product Favorite : ")
    val gadgedProduct = scannerIn.nextLine()
    val housingProduct = scannerIn.nextLine()
    val toiletTrisProduct = scannerIn.nextLine()
    val arrayList = ArrayList<String>()
    arrayList.add(gadgedProduct)
    arrayList.add(housingProduct)
    arrayList.add(toiletTrisProduct)
    productList(arrayList)
}


fun productList(categoryProduct: List<String>) {
    println()
    for (i in categoryProduct) {
        println(i)
    }
}
