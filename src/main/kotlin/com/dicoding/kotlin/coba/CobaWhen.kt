package com.dicoding.kotlin.coba

fun main() {
    val data = data()

    for (i in data) {
        when (i.state) {
            State.LOADING -> println("Loading")
            State.SUCCESS -> println("Success")
            else -> {
                State.ERROR
                println("Error")
            }
        }
    }
}



data class Data(var state: State)


enum class State { LOADING, SUCCESS, ERROR}




fun data(): List<Data> {
    val mutableData  = mutableListOf<Data>()
    val loading = Data(State.LOADING)
    val succes = Data(State.SUCCESS)
    mutableData.add(loading)
    mutableData.add((succes))

    return mutableData
}