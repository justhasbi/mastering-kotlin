package com.kotlin.coroutines

import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new Job!")
    }

    delay(2000)
    // dapat menambahkan satu parameter dalam cancel() yaitu parameter cause
    job.cancel(cause = CancellationException("Time is up!"))
    println("Canceling job...")
    if(job.isCancelled) {
        // getCancellationException() berguna untuk mendapatkan waktu eksekusi job
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}