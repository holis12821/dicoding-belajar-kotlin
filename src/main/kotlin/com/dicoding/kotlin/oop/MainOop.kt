package com.dicoding.kotlin.oop

fun main() {
    val engineElectric = EngineElectric()
    val avanza = Car(engineElectric)
    println("____Mobil Avanza____")
    println("Maximal Speed : ${avanza.maxSpeed}km/jam")
    println("Minimal Speed: ${avanza.minSpeed}km/jam")

    avanza.startEngine()

    var brake = avanza.brakeEngine()

    while(brake <= 99) {
      if (brake == 20) break
      println("Engine brake di kecepatan : $brake km/jam")
        brake--
    }

    val engineDiesel = EngineDiesel()

    val truck = Truck(engineDiesel)



}


fun Car.brakeEngine(): Int {
   return this.maxSpeed
}