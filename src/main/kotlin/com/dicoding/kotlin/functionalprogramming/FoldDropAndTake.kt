package com.dicoding.kotlin.functionalprogramming

import io.reactivex.internal.operators.flowable.FlowableDistinct

fun main() {
    val numbers = listOf(1, 2, 3)

    val fold = numbers.fold(10) {current, item ->
        println("Current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result : $fold")
    dropItem()
    takeItem()
    sliceItem()
    sliceItemStep()
    indexToList()
    distinctList()
    distinctListDataClass()
    distinctListText()
    chunkedList()
}

data class Item(
    val key: String,
    val value: Any
)



fun dropItem() {
    val number = listOf(1, 2 , 3, 4, 5, 6)
    val drop = number.drop(2)
    println(drop)

}

fun takeItem() {
    val number = (1..10).toList() //casting range to list
    val take = number.take(3)
    println(take)
}

fun sliceItem() {
    val total = (1..10).toList()
    val slice = total.slice(3..6)
    println(slice)
}

fun sliceItemStep() {
    val total = (1..10).toList()
    val slice = total.slice(3..6 step 2)
    println(slice)
}

fun indexToList() {
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)
    println(slice)
}

fun distinctList() {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()
    println(distinct)
}

fun distinctListDataClass() {
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy {
        it.key
    }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
}

fun distinctListText() {
    val text = listOf(
        "A",
        "B",
        "CC",
        "DD",
        "EEE",
        "F",
        "GGGG"
    )

    val distinct = text.distinctBy {
        it.length
    }
    distinct.forEach {
        println(it)
    }
}

fun chunkedList() {
    val word = "QWERTYUIOPASD"
    val chunked = word.chunked(6)
    val chunkedTransform = word.chunked(6) {
        it.toString().toLowerCase()
    }
    println()
    chunked.forEach {
        println(it)
    }
    println()
    println(chunkedTransform)
}


