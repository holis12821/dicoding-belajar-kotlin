package com.dicoding.kotlin.functionalprogrammingparadigm


val list = DisplayUser.getListUser()


fun main() {
    val name = getUserName()
    for (nameUser in name) {
        println(nameUser)
    }
}

//only one have get username from user
//jadi interface mutable list akan memberikan nilainya
//atau elemennya ke interface immutable list
//karena interface immutable list bisa menerima elemen tetapi hanya sekali tampung
//kecuali kita memberikannya ke dlm fungsi yg argumennya bertipe generic itu akan error karna
//interface list adalah covariant
fun getUserName(): List<String> {
    val name = mutableListOf<String>()

    for (user in list) {
        name.add(user.name)
    }
    return name
}

