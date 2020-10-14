package com.kotlin.generics

/*
    Generics, yaitu sebuah konsep yang memungkinkan suatu kelas atau interface menjadi
    tipe parameter yang dapat digunakan untuk berbagai macam tipe data.

    Generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita
    gunakan. Pendeklarasiannya ditandai dengan tipe parameter.

    Penerapan dengan meletakan type parameter ke dalam (<>)

 */

interface List<P> {
    operator fun get(index: Int) : P
}

class LongList: List<Long> {
    override fun get(index: Int): Long {
        TODO("Not yet implemented")
    }
}

// mengembalikan nilai parameter <T>
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}
// sehingga ketika inisialisasi dari class tersebut harus menyertakan Tipe
// pada Instance


fun main() {
    val contributor= listOf<String>("Hasbi", "Dilan", "Robby", "Vido", "Mulya")
    val points = mapOf<String, Int>("Hasbi" to 100, "Rendi" to 80)
    println(listOf(contributor, points))

    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
}


