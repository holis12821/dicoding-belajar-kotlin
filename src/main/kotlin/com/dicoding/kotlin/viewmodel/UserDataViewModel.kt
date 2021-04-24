package com.dicoding.kotlin.viewmodel

import com.dicoding.kotlin.model.UserData

class UserDataViewModel{
    private val mutableShowDialog = mutableListOf<UserData>()
    private val showDialog: List<UserData> = mutableShowDialog

    fun addData() {
        val userData = UserData("Nurholis", 21)
        val userData2 = userData.copy(name = "Wahyu Eka", age = 22)

        mutableShowDialog.add(userData)
        mutableShowDialog.add(userData2)
    }

    fun showData()  {
        for (i in showDialog) {
            println("Name : ${i.name}")
            println("Age : ${i.age}")
            println()
        }
    }
}