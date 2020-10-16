package com.kotlin.coroutines

import kotlinx.coroutines.*

// CoroutineDispatcher merupakan base class dari coroutine untuk menentukan
// thread mana yang akan digunakan

// Dispatcher.Default
/*
    Contoh:
    launch(Dispatcher.Default) {
        //Todo: Implement suspending lambda here
    }
 */

// Dispatcher.IO
// digunakan untuk membuka pemblokiran IO
/*
    Contoh:
    launch(Dispatcher.IO){
        //Todo: Implement suspending lambda here
    }
 */

// Dispatcher.Unconfined
fun main() = runBlocking<Unit> {
    // menentukan thread yang akan digunakan
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        // Get from Thread, then get current thread, next get thread name
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
    Penjelasan:
    Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh
    fungsi delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali
    pada thread DefaultExecutor.
 */