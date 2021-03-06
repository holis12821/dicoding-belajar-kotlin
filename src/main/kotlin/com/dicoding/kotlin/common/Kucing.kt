package com.dicoding.kotlin.common

import com.dicoding.kotlin.enumeration.ColorEnum

open class Kucing: Hewan() {

    override val color: ColorEnum
        get() = super.color

    override val height: Int
        get() = super.height

    override val weight: Int
        get() = super.weight

     override  val name: String
       get() = super.name

    override fun eating(): String {
      val weighEatingInstance =   weight + 1
        return "Berat Badan : $weighEatingInstance"
    }
}