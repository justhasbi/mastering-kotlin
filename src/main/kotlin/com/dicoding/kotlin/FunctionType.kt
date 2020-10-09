package com.dicoding.kotlin

// (Int, Int) -> Int
// Berguna untuk menyimpan parameter tipe data lambda expression

// String merupakan tipe kembalian,
// (Int, Int) merupakan tipe data dari dua parameter function
// jika ditulis lengkap seperti dibawah
/*
    fun arithmetic(val coba: Int, val coba2: Int): Int {}
 */

// Contoh Program

fun main() {
    // membuat instance dari tipe data function
    val sum: Arithmetic = {  valueA, valueB -> valueA + valueB}
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    // menggunakan instance dari tipe data function
    val sumResult = sum?.invoke(10, 10)
    val multiplyResult = multiply?.invoke(20, 20)
    println("$sumResult, $multiplyResult")
}
// type function
// menambahkan nullable operator
typealias Arithmetic = ((Int, Int) -> Int)?