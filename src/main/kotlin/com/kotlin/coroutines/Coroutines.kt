package com.kotlin.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
//    launch {
//        delay(1000L)
//        println("Coroutines!")
//    }
//    delay(2000L)
//    println("Hello, ")

    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("your profit is ${income - capital}")
    }
    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("your profit is ${income.await() - capital.await()}")
    }


    println("Completed in $timeOne ms vs $timeTwo ms")
}

suspend fun getCapital(): Int {
    delay(1000L)
    return  50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}