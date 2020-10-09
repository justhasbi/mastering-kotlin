package com.dicoding.kotlin

fun main() {
    println(16.slice)
}

val Int?.slice: Int
// get() = if (this == null) 0 else this.div(2)
get() = this?.div(2) ?: 0