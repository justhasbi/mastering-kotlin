package com.dicoding.kotlin

// function reference menggunakan operator ::
var messages = "Kotlin Dicoding"

fun main()  {
    // property refernce
    println(::message.name)
    println(::message.get())


    // lambda dengan function type
    val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB}
    println(sum(2,3))

    val sum2: (Int, Int) -> Int = ::count
    println(sum2(2, 3))

    // function reference menggunakan operator ::
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    // function reference menggunakan extension function
    val evenNumbers2 = numbers.filter(Int::isEvenNumbers)
    println(evenNumbers2)

    println()
}

fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

fun isEvenNumber(number: Int) = number % 2 ==0

fun Int.isEvenNumbers() = this % 2 == 0