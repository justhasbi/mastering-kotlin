package com.dicoding.kotlin

//data class
fun main() {
    // List merupakan array
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c', 'd')
    val listAny = listOf('a', "coba", 1, true)
    println(listOf(numberList, charList, listAny))
    // dapat memasukan function dalam list
    // contoh:
    fun fullname(): String {
        return "Hasbi Shuhada"
    }

    val listIncFunction = listOf("hasbi", "Shuhada", fullname())
    println(listIncFunction)

    // NOTE: List dalam kotlin bersifat immutable, yaitu tidak dapat diubah
    // Gunakan mutableListOf() untuk membuat list dengan sifat mutable

    val anyListMutable = mutableListOf("hasbi", 'c', 2, false, fullname())
    println(anyListMutable)
    anyListMutable[0] = "rendi"
    println(anyListMutable)
    anyListMutable.removeAt(1)
    println(anyListMutable)
    anyListMutable.add(2, 'X')
    println(anyListMutable)
}