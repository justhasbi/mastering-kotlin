package com.oop.kotlin

import java.lang.Exception
import java.lang.NumberFormatException

// try - catch

fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0
    // lateinit var someMustNotNullValue: String

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue) {
            0 -> println("Catch blok NullPointerException terpanggil")
            -1 -> println("Catch blok NumberFormatException terpanggil")
            else -> println(someIntValue)
        }
    }
}