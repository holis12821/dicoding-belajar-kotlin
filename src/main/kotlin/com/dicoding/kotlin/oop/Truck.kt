package com.dicoding.kotlin.oop

class Truck(private val engine: Engine): Vehicle() {
    override val maxTANK: Int
        get() = 20
    override val minSpeed: Int
        get() = 6
    override val maxSpeed: Int
        get() = 10

    override fun startEngine() {
        engine.start()
    }

    override fun stopEngine() {
        engine.stop()
    }

    fun Engine.onEngine() {
        println("Engine : ${this.start()} ")
    }
}