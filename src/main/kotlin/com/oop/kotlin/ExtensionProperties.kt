package com.oop.kotlin

class AnimalExtension(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

// memisahkan properti dengan kelas
val AnimalExtension.getAnimalInfo : String
    get() = "Nama: ${this.name}, Weight: ${this.weight}, Age: ${this.age}, Mammal?: ${this.isMammal}"

fun main() {
    val moriCat = AnimalExtension("Mori cat", 2.2, 2, true)
    println(moriCat.getAnimalInfo)
}