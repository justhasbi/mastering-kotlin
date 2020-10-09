package com.dicoding.kotlin

fun main() {
    val numbers = SumNumber(10, 15, 50, 40)
    println(numbers)
    println(asList(12, 12, 14, 13))

    // Cara memanggil extension function
    10.printInt()

    // memanggil extension property
    println(12.slice)
}

fun SumNumber(vararg numberArg: Int): Int {
    return numberArg.sum()
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}
// Extension Functions. CONTOH:
// Int. merupakan receiver type
fun Int.printInt() {
    println("Value: $this")
}

// Extension Property
val Int.slice: Int
    get() = this / 2