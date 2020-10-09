package com.dicoding.kotlin

fun main() {
    // filter() dan filterNot()
    val numberList = listOf(1,2,3,4,5,62,10)
    val numberFilter = numberList.filter { it % 2 == 0 }
    println(numberList.filterNot { it % 2 == 0 })
    println(numberFilter)
    // map()
    println(numberList.map { it * 2 })
    // count()
    println(numberList.count())
    // menampilkan nilai yang kelipatan dari 2
    println(numberList.count { it % 2 == 0 })
    // find(), firstOrNull(), lastOrNull()

    println("hasil ${numberList.find { it % 2 == 1 }}")
    // mencari nilai pertama atau null
    println("hasil ${numberList.firstOrNull { it % 2 == 1 }}")
    // mencari nilai terakhir atau null
    println("hasil ${numberList.lastOrNull { it % 2 == 1 }}")

    // first() dan last()
    println("hasil first(): ${numberList.first { it > 3 }}")
    println("hasil last(): ${numberList.last { it > 3 }}")

    // sum()
    println("hasil sum(): ${numberList.sum()}")

    // sorted(), sortedDescending()
    println("hasil sorted(): ${numberList.sorted()}")
    println("hasil sortedDesc(): ${numberList.sortedDescending()}")
}