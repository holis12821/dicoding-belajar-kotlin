/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.dicoding.kotlin

class App {
    val greeting: String
        get() {
            return "Hello World"
        }
}

fun main() {
    val name = "Alfian"

    print("Hello my name is")
    println(name)
    /*if dijadikan sebagai ekspresi*/
    print(if (name == "Alfian") "Always true" else "always false")
    println(App().greeting)
}
