package com.dicoding.kotlin

fun main() {
    //  set() hanya dapat menyimpan nilai unik
    //  println(integerSet)
    //  set() secara otomatis menghapus nilai yang sama
    val setA = setOf(3, 3, 2, 4, 5, 6)
    val setB = setOf(2, 5, 6)
    val setC = setOf(1, 5, 8)
    //  println(setDua == integerSet)
    //  println(4 in setDua || 4 in integerSet)

    //  fungsi union() dan intersect
    val unionSet = setA.union(setC)
    val intersectSet = setA.intersect(setC)

    println(unionSet)
    println(intersectSet)
}