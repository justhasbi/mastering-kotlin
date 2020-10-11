package com.oop.kotlin

// call package from utils
import com.oop.kotlin.utils.sayHello
import com.oop.kotlin.utils.*

fun main() {
    sayHello()
    println(factorial(5.0))
    println(pow(5.0, 2.0))
    println(PI)
    println(areaOfCircle(20.0))
}