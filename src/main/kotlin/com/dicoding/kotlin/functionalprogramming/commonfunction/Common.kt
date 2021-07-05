@file:Suppress("KDocUnresolvedReference")

package com.dicoding.kotlin.functionalprogramming.commonfunction

/**
 * @author Nurholis
 * @since 2021
 * @see Todo https://github.com/holis12821/
 * */

/**
 *_______________Documentation_______________
 * this function is Top level function*/

/**
 * this function is general and can be used by any
 * object because there is a generic.
 * this is a lamda with receiver (this) which is used as a parameter
 * in a function called a heigher ordered function with extension approach
 * this function same as apply, run, with in standart library function.
 */

inline fun <T> T.why(block: T.() -> Unit): T {
    block()//otomatis di dalam block function ini
    //karena tipe data genericnya nantinya untuk sebuah objek sama semua
    //secara otomatis ketika memanggil function objek atau lamda
    //kita tdk perlu membuat instance sebuah objek atau receiver type dri class yg menambahkan
    //ekstension function
    //karena receiver typenya juga menambahkan ekstension function dan di dalam parameternya
    //juga menambahkan ekstension function berupa lamda jadi karna sama
    //secara otomatis function objek ini dipanggil oleh receiver objek saat ini atau objek yg saat ini tersedia
    //dan memanggil ekstension function biasa dan ekstension lamda
    return this
}

/**
 * this function is general and can be used by any
 * object because there is a generic.
 * this is a lamda with receiver (this) which is used as a parameter
 * in a function called a heigher ordered function with extension approach.
 * this function same as With in standart library function.
 */

inline fun <T, R> by(receiver: T, block: T.() -> R): R {
    return receiver.block()
}



/**
 * this function is general and can be used by any
 * object because there is a generic.
 * this is a lamda with argument (it) which is used as a parameter
 * in a function called a heigher ordered function.
 * this function is extension function
 * this function same as also in standart library function.
 */

inline fun <T> T.what(block: (T) -> Unit): T {
    block(this)
    return this
}

/**
 * this function is general and can be used by any
 * object because there is a generic.
 * this is lamda with argument (it) which is used as parameter.
 * without the lambda function extension
 * in a function called a heigher ordered function.
 * this function is extension function
 * this function same as let in standart library function*/

inline fun <T, R> T.permit(block: (T) -> R): R {
    return block(this)
}

//mengakses koteks objek berupa nilai yaitu lamda with argument it


/**
 * this function is general and can be used by any
 * object because there is a generic.
 * this is function with lamda expression which is used as an argument
 * to the function and the value returned in the lambda expression is the
 * value assigned to  the lambda body.*/

inline fun <R> execute(block: () -> R): R {
    return block()
}

inline fun <T, R> T.execute(block: T.() -> R): R {
    return block()
}
