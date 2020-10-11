package com.oop.kotlin
import kotlin.random.Random
import kotlin.math.PI as phi
import kotlin.math.cos as cosine
import kotlin.math.sqrt
import kotlin.math.*

/*
    Seluruh konten pada kotlin, seperti class, function dibungkus dalam package
    Untuk menggunakan kelas, fungsi dan variabel dari package lain harus menuliskan
    dengan lengkap alamat package tersebut

    format import package
    import packagename.ClassName
    import packagename.functionName
    import packagename.propertyName

 */
fun main() {
    val someInt = Random(0).nextInt(1, 10)
    println(someInt)

    println(phi)
    println(cosine(12.0 * 20) * sqrt(64.0))
    println(sqrt(16.0))
}