package com.oop.kotlin

class AnimalSecondaryConstructor (name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.name = name
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0)  0 else age
        this.isMammal = false
    }

    // secondary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val moriMiaw = AnimalSecondaryConstructor("Mori", 3.0, 3, true)
    val moriBird = AnimalSecondaryConstructor("Mobird", 0.7, 1)
    val moriMiawMap = mapOf(
            "name" to moriMiaw.name,
            "weight" to moriMiaw.weight,
            "age" to moriMiaw.age,
            "isMammal" to moriMiaw.isMammal
    )
    moriMiawMap.forEach { println(it) }
    println(moriMiawMap.toString())
    println("name: ${moriMiaw.name}, weight: ${moriMiaw.weight}, age: ${moriMiaw.age}, is mammal? ${moriMiaw.isMammal}")
    println("name: ${moriBird.name}, weight: ${moriBird.weight}, age: ${moriBird.age}, is mammal? ${moriBird.isMammal}")
}