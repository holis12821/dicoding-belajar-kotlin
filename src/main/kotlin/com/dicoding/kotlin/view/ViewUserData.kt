package com.dicoding.kotlin.view

import com.dicoding.kotlin.viewmodel.UserDataViewModel

class ViewUserData  {
    private val userDataViewModel = UserDataViewModel()

    fun showData() {
        userDataViewModel.addData()
        userDataViewModel.showData()
    }
}


fun main() {
   val viewUserData = ViewUserData()
   viewUserData.showData()
}