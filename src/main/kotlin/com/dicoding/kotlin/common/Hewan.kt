package com.dicoding.kotlin.common

import com.dicoding.kotlin.enumeration.ColorEnum
import kotlin.random.Random

open class Hewan {
    open val color = ColorEnum.RED
    open val height = Random.nextInt(10)
    open val weight = Random.nextInt(10)

    protected open val name = ""
  open fun eating() = "Eating"
}