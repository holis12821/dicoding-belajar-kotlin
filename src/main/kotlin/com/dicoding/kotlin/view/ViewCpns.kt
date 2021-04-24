package com.dicoding.kotlin.view
import com.dicoding.kotlin.viewmodel.DataCpnsViewModel
import com.sun.deploy.ref.AppModel

class ViewCpns()  {
    private val viewModel = DataCpnsViewModel()
    fun showData() {
        viewModel.showData()
    }
}