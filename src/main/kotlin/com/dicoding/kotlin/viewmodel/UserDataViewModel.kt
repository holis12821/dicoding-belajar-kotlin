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

        //jadi inteface list akan memberikan tipe data generic
        // (untuk elemen"elemen list yg didalamnya )
        // ke dalam
        //variabel i di looping fornya, setelah itu baru di cek apakah
        //objek userdata ada di dlm interface listnya
        //nah ini digunakan untuk kita mengecek apakah objek nya tersebut
        //sesuai dengan tipe data generic dlm listnya ada atau tdk di
        //dlm interface listnya
    }

    fun showData()  {
        for (i in showDialog) {
            println("Name : ${i.name}")
            println("Age : ${i.age}")
            println()
        }
    }
}