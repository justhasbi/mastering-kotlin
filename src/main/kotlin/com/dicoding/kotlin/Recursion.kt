package com.dicoding.kotlin

// ---RECURSION---
/*
    recursive function -> merupakan mekanisme dimana sebuah fungsi digunakan
    dari dalam fungsi itu sendiri.
*/

fun main() {
    println(factorial(100))
}

/* fun factorial(n: Int): Int {
    return if(n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
} */

// recursive method
/* fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n-1)
    }
} */

// Tail Call Recursion
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}