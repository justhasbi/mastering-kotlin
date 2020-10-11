package com.oop.kotlin

// Hak akses pada kotlin
/*  1. public -> dapat diakses dari manapun
    2. private -> hanya dapat diakses pada scope yang sama
    3. protected -> dapat diakses oleh kelas turunannya atau kelas itu sendiri
    4. internal -> tidak dapat diakses dari luar module
 */

// private modifier implementation
class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true){
    // agar dapat diakses properti dari animal
    // perlu menambahkan fungsi setter dan getter secara manual
    fun getName(): String {
        return name
    }
    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
    // cannot access properti becaus it's private in Animal class
    // println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    // Mengakses private properti Animal melalui setter dan getter

    println(dicodingCat.getName())
    dicodingCat.setName("Mori Miaw")
    println(dicodingCat.getName())
}