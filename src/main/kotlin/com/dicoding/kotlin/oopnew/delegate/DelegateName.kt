package com.dicoding.kotlin.oopnew.delegate

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"//menggunakan nilai default

    operator fun getValue(
        classRef: Any?,
        property: KProperty<*>
    ): String {
        println("""
            Fungsi ini sama seperti getter untuk properti ${property.name} 
            pada class $classRef
        """.trimIndent())
        return value
    }

    operator fun setValue(
        classRef: Any?,
        property: KProperty<*>,
        newValue: String) {
        println("""
            Fungsi ini sama seperti setter untuk properti ${property.name}
            pada class $classRef
        """.trimIndent())
        println("""Nilai ${property.name} dari: $value akan berubah menjadi $newValue""")
        value = newValue
    }
}