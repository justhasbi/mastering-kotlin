package com.dicoding.kotlin

import java.lang.StringBuilder

// context object, this (receiver) & it (argument)


fun main() {
    // this
    val buildString = StringBuilder().apply {
        append("Hello")
        append("Dicoding")
    }
    println(buildString)

    // it
    val text = "hello"
    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }

    // run
    // me-return seluruh expression dalam blok lambda
    val result = text.run {
        val from = this
        val to = this.replace("hello", "kotlin")
        "replace text from $from to $to"
    }
    println("Result: $result")

    // with
    // ditempatkan dalam argumen
    /*
    Fungsi with sendiri disarankan untuk mengakses apa yang
    menjadi anggotanya tanpa harus menyediakan nilai kembalian.
     */
    val messages = "Hello Kotlin"
    val result2 = with(messages) {
        "first char is ${this[0]} " + "and last char is ${this[this.length - 1]}"
    }
    println(result2)

    // apply
    // me-return nilai dari context object nya dan menjadi receiver (this)

    /* val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Hasbi")
    println(builder.toString())
    */

    // bentuk apply dari code diatas
    val messages2 = StringBuilder().apply {
        append("Hello")
        append("Hasbi")
    }

    println(messages2.toString())

    // let
    // banyak ditemukan pada objek bertipe non-null
    val messageLet: String? = null
    messageLet?.let {
        val length = it.length * 2
        val textLength = "text length $length"
        println(textLength)
    } ?: run {
        val textLength = "message is null"
        println(textLength)
    }

    // also
    val tulisan = "latihan kotlin"
    val hasil = tulisan.also {
        println("value length -> ${it.length}")
    }

    println("text -> $hasil")

}