package com.dicoding.kotlin.oop

class EngineElectric: Engine() {
    override fun start() {
        println("Engine electric turn on")
    }

    override fun stop() {
        println("Engine electric turn off")
    }
}