package com.dicoding.kotlin

import java.lang.StringBuilder

fun main() {
    println(sum(10))
    printResult(10, sum)

    //contoh lain
    printResult(20){value ->
        value + value
    }

    // contoh lain dari func buildString()
    val message = buildString {
        append("hello ")
        append("from ")
        append("hasbi ")
    }
    println(message)
}

// dapat digunakan pada function lain
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// -> merupakan deklarasi tipe return dari lambda function
val sum: (Int) -> Int = { value -> value + value  }

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return  stringBuilder.toString()
}