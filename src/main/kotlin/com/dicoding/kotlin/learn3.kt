//package com.dicoding.kotlin

fun  main() {
    val colorRED = Color.RED
    val colorGREEN = Color.GREEN
    val colorBLUE = Color.BLUE

    colorBLUE.printValue()
    colorGREEN.printValue()
    colorRED.printValue()
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override  fun  printValue() {
            println("Value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}