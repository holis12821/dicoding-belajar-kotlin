package com.dicoding.kotlin.viewmodel

import com.dicoding.kotlin.cpns.DataCpns

class DataCpnsViewModel {
    private val mutableList = mutableListOf<DataCpns>()
    private val listCpns: List<DataCpns>  = mutableList

    private fun addData() {
        val dataCpns1 = DataCpns(
            170112223L,
            "Nurholis",
            21,
            87.6
        )

        val dataCpns2 = DataCpns(
            1776333211L,
            "Wahyu Eka Mahendra",
            21,
            78.7
        )

        val dataCpns3 = DataCpns(
            178112189L,
            "Alfat Yauma",
            23,
            86.7
        )
        val dataCpns4 = DataCpns(
            179117677L,
            "Achmad Riyadi",
            22,
            77.7
        )
        val dataCpns5 = DataCpns(
            1801126777L,
            "Aldi Nugroho",
            21,
            65.7
        )
        val dataCpns6 = DataCpns(
            18198800110L,
            "Johar Saputra Irshandi",
            21,
            97.7
        )
        //add data
        mutableList.add(dataCpns1)
        mutableList.add(dataCpns2)
        mutableList.add(dataCpns3)
        mutableList.add(dataCpns4)
        mutableList.add(dataCpns5)
        mutableList.add(dataCpns6)

    }

    fun showData(){
        addData()
        println("+++++++++Peserta yg lulus CPNS tahun 2021+++++++")
        println()
        listCpns.filter {
           it.passingGrade >= 85.7
       }.forEach {
           println("nip : ${it.nip}")
           println("name : ${it.name}")
           println("age : ${it.age}")
           println("passing grade =  ${it.passingGrade}")
           println()
       }

       println()
       filterNotNul()
    }


    private fun filterNotNul() {
        println("+++++++++Data CPNS yg tidak lolos seleksi+++++++++")
        println()
        listCpns.filterNot {
            it.passingGrade >= 85.7
        }.forEach {
            println("nip : ${it.nip}")
            println("name : ${it.name}")
            println("age : ${it.age}")
            println("passing grade =  ${it.passingGrade}")
            println()
        }
    }
}