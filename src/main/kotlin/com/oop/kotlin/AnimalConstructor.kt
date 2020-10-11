package com.oop.kotlin

/*  -- primary constructor
    class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
 */
//  -- secondary constructor
//  -- default constructor

// Init Block
// dapat dugunakan untuk validasi nilai masukan sebelum diinisialisasi

class AnimalConstructor(name: String, weight: Double, age: Int, isMammal: Boolean) {
    // membutuhkan inisialisasi nilai
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    // inisialisasi nilai
    // dapat dijoin dengan assigment
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {
    val moo = AnimalConstructor("CowMoo", 120.0, 15, true)
    println(listOf(moo.name, moo.weight, moo.age, moo.isMammal))
}
