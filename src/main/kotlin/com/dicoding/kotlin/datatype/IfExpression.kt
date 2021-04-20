package com.dicoding.kotlin.datatype

fun main() {
    ifExpression()
    ifExpression2()
    ifElseIf()
    conjunction()
    disjunction()
    negation()
}

fun ifExpression(){
    /*assigment variabel
    with use a if expression*/
    val openHours = 7
    val now =  20
    val a : Int = if (openHours > now) {
       12
    } else {
        11
    }
    println(a)
}

fun ifExpression2(){
    val openHours = 7
    val now = 20
    val office: String =
    if (now > openHours){
         "Office alredy open"
    } else {
        "Office is closed"
    }

    println(office)
}

fun ifElseIf(){
    val openHours = 7
    val now = 7
    val office = when {
        now > 7 -> {
            "Office alredy open"
        }
        now == openHours -> {
            "Wait a minute, office will be open"
        }
        else -> {
            "Office is closed"
        }
    }
    println(office)
}

fun conjunction() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now in officeOpen..officeClosed
    /*because 20 isn't range 7 to 16*/
    println("Office is open : $isOpen")
}

fun disjunction() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = (now < officeOpen || now > officeClosed) || (now < officeOpen || now > officeClosed)
    println("Office is closed : $isClose")
}

fun negation(){
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen /*true*/
    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}

