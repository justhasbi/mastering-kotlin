package com.oop.kotlin

// Protected
// hanya dapat diakses melalui kelas turunannya

// Contoh
open class AnimalProtected(val name: String, protected val weight: Double)

class CatChild(pName: String, pWeight: Double) : AnimalProtected(pName, pWeight)

fun main() {
    val catMori = CatChild("Mori Cat", 3.0)
    println("Cat Name: ${catMori.name}")

    // Error
    // println("Cat Weight: ${catMori.weight}")
}