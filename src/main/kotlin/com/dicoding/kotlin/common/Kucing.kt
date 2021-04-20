package com.dicoding.kotlin.common

import com.dicoding.kotlin.enumeration.ColorEnum

class Kucing: Hewan() {

    override val color: ColorEnum
        get() = super.color

    override val height: Int
        get() = super.height

    override val weight: Int
        get() = super.weight

    override fun eating(): String {
      val weighEatingInstance =   weight + 1
        return "Berat Badan : $weighEatingInstance"
    }
}