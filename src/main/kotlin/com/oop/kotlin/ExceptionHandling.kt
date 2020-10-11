package com.oop.kotlin

/*
    Exception -> event yang dapat mengacaukan jalannya suatu program.
    1. ArithmeticException -> membagi bilangan dengan nol
    2. NumberFormatException -> kesalahan format angka
    3. NullPointerException -> sebuah variabel atau objek memiliki nilai null
 */

fun main() {
    // ArithmeticException
    val someValue = 6
    println(someValue / 0)

    // NumberFormatException
    val someStringValue = "18.0"
    println(someStringValue.toInt())

    // NullPointerException
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}