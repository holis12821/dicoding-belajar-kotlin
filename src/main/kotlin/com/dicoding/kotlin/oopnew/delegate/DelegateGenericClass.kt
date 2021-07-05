package com.dicoding.kotlin.oopnew.delegate

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(
        classRef: Any,
        property: KProperty<*>
    ): Any {
        println("""
            Fungsi ini sama aseperti getter untuk properti
            ${property.name} pada class $classRef
        """.trimIndent())
        return value
    }

    operator fun setValue(
        classRef: Any,
        property: KProperty<*>,
        newValue: Any
    ) {
        println("""
            Nilai ${property.name} dari : $value akan berubah menjadi $newValue
        """.trimIndent())
        value = newValue
    }
}