package com.oop.kotlin

// membutuhkan open class sebagai parent class
// class pada kotlin bersifat final
open class AnimalInheritance(val name: String, val weight: Double, val age: Int, val isCarnivora: Boolean) {
    open fun eat() {
        println("$name sedang makan!")
    }
    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furCollor: String, val numberOfFeet: Int):
        AnimalInheritance(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name plaw with human")
    }

    override fun eat() {
        println("$name eating fish")
    }

    override fun sleep() {
        println("$name sleep in the pillow")
    }
}

class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val scaleColor: String, val numberOfFin: Int) :
        AnimalInheritance(pName,  pWeight, pAge, pIsCarnivore) {
    fun swim() {
        println("$name swim faster")
    }

    override fun eat() {
        println("$name eating another fish")
    }

    override fun sleep() {
        println("$name not sleep")
    }
}

fun main() {
    val moriCat = Cat("Mori Miaw", 3.2, 2, true, "Black", 4)

    moriCat.playWithHuman()
    moriCat.eat()
    moriCat.sleep()

    val fishMori = Fish("Mori Fish", 0.3, 1, false, "gold", 6)
    fishMori.swim()
    fishMori.eat()
    fishMori.sleep()
}