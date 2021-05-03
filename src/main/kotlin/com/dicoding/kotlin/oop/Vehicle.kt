package com.dicoding.kotlin.oop

abstract class Vehicle {
    abstract val maxTANK: Int
    abstract val minSpeed: Int
    abstract val maxSpeed: Int

    abstract fun startEngine()
    abstract fun stopEngine()
    //abstract fun brake()
}