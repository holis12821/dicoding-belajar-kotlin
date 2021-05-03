package com.dicoding.kotlin.oop

fun main() {
    val engineElectric = EngineElectric()
    val avanza = Car(engineElectric)
    println("____Mobil Avanza____")
    println("Maximal Speed : ${avanza.maxSpeed}km/jam")
    println("Minimal Speed: ${avanza.minSpeed}km/jam")

    avanza.startEngine()
    avanza.breakEngine()

    val engineDiesel = EngineDiesel()

    val truck = Truck(engineDiesel)
}


fun Car.breakEngine(): Int {
   return this.maxSpeed - 2
}