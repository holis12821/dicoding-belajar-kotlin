package com.dicoding.kotlin.functionalprogramming.recursion

fun main() {
   println(factorial(10))
    println(factorialRecursion(5))
    println(factorialTailrec(20))
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n)
            result *= i
        result
    }

}

fun factorialRecursion(n: Int): Int =
    if (n == 1) n else n * factorialRecursion(n - 1 )

    /**
     * jadi nilai n ini akan menjadi patokan untuk memanggil fungsinya
     * itu sendiri
     * jadi jika n = 5 yaudah akan mengecek if atau elsenya nya dulu
     * baru akan di return
     * nah ketika di eksekusi ke else otomatis dia tidak mereturn
     * dulu melainkan memanggil fungsinya lagi yg awalnya
     * nilai  n dilamprkan 5 karna tdk = 1 maka else dieksekusi
     * dan memanggil fungsi kembali yg mana nilai n dari parameter
     * fungsi tersebut n = 5 lalu dikurangi 1 menjadi n -1 = 5 -1 = 4
     * karna mengeksekusi fungsi lagi otomatis akan mengeksekusi parameter formal
     * dari fungsinya dan mengecek apakah n = 1 jika tdk akan ke else dan memanggil
     * fungsi nya kembali terus sampai n = 1 baru nilai yg dikembalikan
     * adalah 1 dan mentotalkan nilainya lalu baru di return ke fungsi tersebut
     * sebagai hasil dari perkalian.*/

/**pas fungsi rekursif dipanggil dengan keyword
 * return dan akan mengeksekusi parameter formal
 * dan akan lanjut lagi mengeksekusi diri nya sendiri atau fungsi rekursif*/


    /*
    * Setiap pemanggilannya bisa kita atur agar dapat mengembalikan nilai dan
    * digunakan sebagai argumen untuk pemanggilan fungsi berikutnya serta mengembalikan
    * nilai akhir berupa perhitungan nilai
    *  kembalian dari setiap pemanggilan fungsi tersebut.*/


tailrec fun factorialTailrec(
    n: Int,
    result: Int = 1
): Int {
    val newResult = n * result
    return if (n == 1) newResult else factorialTailrec(n -1, newResult)
}
// fungsi rekursif yg bermodifier tailrec akan secara otomatis
//di jadikan oleh kotlin menjadi model perulangan saat kodenya di konversi menjadi
//bytecode saat selesai di kompilasi