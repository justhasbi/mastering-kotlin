package com.oop.kotlin

/*
    Interfaces
    -> mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan fungsi
    yang dideklarasikan tanpa isi. Tujuan dari interface ini hanya untuk
    diimplementasikan oleh sebuah kelas.
 */

interface Ifly {
    fun fly()
    // menambahkan properti
    val numberOfWings: Int
}

    /*  harus implement fungsi yang terdapat dalam interface dengan cara override
        fungsi yang terdapat pada Ifly
    */
class Bird(override val numberOfWings: Int) : Ifly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }
}

fun main() {
    val parrot = Bird(2)
    parrot.fly()
}