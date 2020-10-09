package com.oop.kotlin

class AnimalClass(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) {
    fun eat() {
        println("$name makan")
    }

    fun sleep() {
        println("$name tidur")
    }
}

fun main() {
    val geckoLizard = AnimalClass("Gecko", 0.20, 1, false)
    println("Name: ${geckoLizard.name}, weight: ${geckoLizard.weight}, age: ${geckoLizard.weight}, is Mammal? ${geckoLizard.isMammal} ")

    geckoLizard.sleep()
    geckoLizard.eat()
}