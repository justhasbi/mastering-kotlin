package com.kotlin.coroutines

import kotlinx.coroutines.*

// using launch()

fun main() = runBlocking {
    // start = CoroutineStart.LAZY digunakan untuk menunda job dijalankan
    val job = launch(start = CoroutineStart.LAZY) {
        // Do background task here
        delay(1000L)
        println("yeay start new job")
    }

    //job.start()
    job.join()
    // setelah dijalankan, job akan memiliki state active
    // dapat menggunaka job.join()
    println("Other task")
}

/*
using Job()
fun main() = runBlocking {
    val job = Job()
}
 */