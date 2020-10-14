package com.kotlin.generics


fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}