package com.dicoding.kotlin.oop
/*Dependency Injection*/
class Car(private val engine: Engine): Vehicle() {

    override val maxTANK: Int
        get() = 11
    override val minSpeed: Int
        get() = 30
    override val maxSpeed: Int
        get() = 70

    override fun startEngine() {
      engine.start()
    }



    override fun stopEngine() {
       engine.stop()
    }

    fun brake() {
        println("Car Berhenti")
    }
}