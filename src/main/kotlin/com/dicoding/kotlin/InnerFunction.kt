package com.dicoding.kotlin

import java.lang.IllegalArgumentException

fun main() {
    setWord("hasbi")
    println(sum(20, 20, 20))
}

// nested function
fun setWord(message: String) {
    // dapat menerima
    fun printMessage() {
        println(message)
    }
    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    // Normal function
//    fun validateNumber(value: Int) {
//
//        if(value == 0) {
//            throw IllegalArgumentException("Value must be better than 0")
//        }
//    }

    // Extension function
    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must greater than 0")
        }
    }
    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB * valueC


}
