package com.dicoding.kotlin.nodataclasses

class DataUser(
    private val name: String,
    private val age: Int
) {
    fun name(): String = name
    fun age(): Int = age

    override fun toString(): String {
        return "DataUser(name=$name,age=$age"
    }

    override fun equals(other: Any?): Boolean {
        /*todo 1 membandingkan nama class nya terlebih dahulu*/
        if (this === other) return true /*ini tdk dijalankan jika 2 objeknya berbeda*/
        /*walau di instance dengan class yg sama tetapi setiap membuat sebuah objek dri kelas yg sama tersebut
        * secara tdk langsung kita membuat sebuah objek yg berbeda dan alamat memorynya berbeda
        * karena setiap objek memiliki karakteristiknya sendiri" yg unik yaitu alamat memory nya berbeda antara objek 1
        * dengan objek lainnya jadi jika di cocokan dengan operator === maka sebenatnya yg dicocokan itu adalah
        * tipe atau objeknya itu sama atau tdk karena alamat memorynya berbeda jadi objek ini adalah 2 objek yg berbeda*/
        if (javaClass != other?.javaClass) return false


       other as DataUser /*objek other
       yg merupakan tipe dari super class Any
       di casting menjadi subclassnya yaitu DataUser
       otomatis other menjadi tipe Datauser dan bisa mengakses
       field atau property dan method dri class data user*/
       /*other superclass sebagai subclassnya*/
        /*todo 2 membandingkan propertynya terlebih dahulu apakah nilainya sama atau tdk*/
        if (name != other.name) return false
       if (age != other.age) return false

       return true
    }

    /*method hashcode akan dijalankan ketika method equals itu dipanggil*/
    /*dan method hashcode ini itu sebenarnya adalah representasi dri alamat memory pada objek yg berbentuk
    * nilai Int unik dan random. ketika method equals dipanggil hashcode langsung dipanggil dan equals melihat kecocokan dri
    * alamat memory pada objek yg dihasilkan dari method hashcode
    * ternyata objek a mengakses method equals secara default dan b juga demikian
    * maka kedua objek ini mengakses hashcode yg sama dengan nilai return value yg sama
    * secara otomatis karena hashcode representasi dari alamat memory yg berbentuk Int
    * maka dari itu 2 objek ini dikatakan sama karena alamat memory nya sama antara objek A dan B karena
    * dimanipulasi oleh method hashcode. objek yg sama mengakses hashcode yg sama oleh karena itu
    * alamat memorynya sama
    * barulah method equals membandingkan isi dari 2 objek tersebut antara A dan B*/
    override fun hashCode(): Int { /*method hashcode digunakan
    untuk membandingkaan alamat memory pada kedua objek yg di representasikan menjadi bilangan atau
    nilai integer random dan unik*/
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }


}