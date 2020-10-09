package com.dicoding.kotlin

fun main() {
//    val coba = arrayOf(1,3,5,2)
//    for (i in coba) {
//        println(i)
//    }

//    val anotherArr = Array(4, { i -> i * i })
//    for (c in anotherArr) {
//        println(c)
//    }

//    fun learnFunc(a: Int, b: Int ): Int {
//        return a * b
//    }
//
//    println(learnFunc(2, 3))
//
//    fun setUser(name: String, age: String): String {
//        return "your name is: $name, and your age: $age"
//    }
//    println(setUser("hasbi", "20"))

    val user = setUser("hasbi", 20)
    println(user)

    printUser("Shuhada")
}

fun setUser(name: String, age: Int): String = "your name is: $name, and your age: $age"

fun printUser(name: String) {
    println("My name is $name")
}