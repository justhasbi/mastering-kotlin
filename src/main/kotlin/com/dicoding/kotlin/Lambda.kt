package com.dicoding.kotlin

fun main() {
    // function literals

    val comparator = Runnable { /* TODO: */ }

    message()
    printMessage("lambda function params")
    val lengthMessage = messageLength("Halo dari mahasiswa unisbank")
    println(lengthMessage)
}

val message = { println("Lambda Function") }
// Lambda with arguments
val printMessage = { message:String -> println(message) }

val messageLength = { message:String -> message.length }

