package com.dicoding.kotlin

/*
    Merupakan lazy evaluation hanya akan mengevaluasi  item
    jika benar-benar diperlukan.
 */

fun main() {
    // contoh eager evaluation
    val list = (1..500000).toList()
    // list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // untuk melakukan sequence dapat menggunakan function asSequence()
    // list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    /* fungsi generateSequence memiliki dua params yaitu item pertama
        kemudian param kedua lambda expression
    * */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(10).forEach { print("$it ") }
}