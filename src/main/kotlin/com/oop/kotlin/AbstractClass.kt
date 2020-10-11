package com.oop.kotlin

//  Abstract class merupakan gambaran umum dari kelas.

/*  Abstract class tidak dapat direalisasikan kedalam sebuah objek.
    Tetapi dapat diturunkan sifatnya kepada child class-nya
 */

// Untuk menjadikan abstract class dengan menggunakan keyword abstract

abstract class AbstractAnimal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {
    fun eat() {
        println("$name sedang makan")
    }
    fun sleep() {
        println("$name sedang tidur")
    }
}

fun main() {
    // tidak dapat diinisialisasikan menjadi sebuah objek
        // val animal = AbstractAnimal("Mori Miaw", 2.5, 1, true)
    // error
}