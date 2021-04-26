package com.dicoding.kotlin.sequance

fun main() {
    /*dengan fungsi filter masing-masing element kita evaluasi dengan kondisi
    * atau kita seleksi dengan kondisi yg kita berikan*/

    /*algoritma sequence*/
    /*jadi evaluasi sequence yg lazy akan memasukan satu satu elemen ke
    * interface list
    * jika elemen terpenuhi maka dimasukan ke interface list untuk
    * menyimpan elemen hasil lulus seleksi yg berisi
    * bilangan kelipatan 5 karena saat dievaluasi dengan
    * kondisi elemen" elemen inilah yg lulus seleksi
    *  karena kita menyeleksi elemen" dengan cara elemen"
    * yg di dalam interface list kita evaluasi berdasarkan kondisi
    * yg kita berikan, dan dia tdk lanjut ke iterasi berikutnya
    * atau ke element berikutnya untuk di evaluasi karena kegetolan
    * elemen selanjutnya ingin cepat cepat atau semnagat ingin dievaluasi
    * juga dengan kondisi yg diberikan atau ini bersifat eager evaluation.
    * jika lazy evaluation maka elemen akan di evaluasi jika benar-benar kita perlukan
    * atau dlm arti kondisinya terpenuhi, jika terpenuhi berarti hanya elemen inilah
    * yg kita perlukan nah setelah itu
    * lanjut ke mapping
    * di mapping elemen kita rubah dengan kita kalikan 2 sehingga menghasilkan
    * collection baru lalu kita simpan lagi ke dlm interface list untuk mapping list elemen yg baru
    *
    * setelah itu kita tampilkan dengan looping sekali dengan elemen
    * yg ingin ditampilkan yg looping foreach ini merefers ke elemen
    * element yg di dlm interface
    * baru selanjutnya kembali ke iterasi berikutnya atau ke filter yg akan mengevaluasi
    * element berikutnya.*/


    /*map fungsi operasi collection yg tdk hanya digunakan untuk membuat collection
    * baru dengan perubahan yg kita lakukan pada mapnya misal * atau + denga elemen sblmnya
    * tetapi juga digunakan untuk mengakses elemen dri collection*/


    val sequence = generateSequence(1) {it + 1}
    sequence.take(5).forEach { println("$it") }

}