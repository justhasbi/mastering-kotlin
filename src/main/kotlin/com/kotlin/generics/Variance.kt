package com.kotlin.generics

/*
    Varuiance -> konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama
    dan tipe argumen yang berbeda saling berkaitan satu sama lain.

    Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang
    tidak akan mengganggu dalam penggunaannya
 */

abstract class Vehicle(wheel: Int)

class Car(speed: Int) : Vehicle(4)

class MotorCycle(speed: Int): Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(200), Car(120))
    val vehicleList = carList
}

/*
    bagaimana cara membuat kelas generic yang memiliki variance? Caranya sama seperti ketika
    kita membuat generic kelas pada umumnya. Namun untuk tipe parameternya kita membutuhkan
    kata kunci out untuk covariant atau kunci in untuk contravariant.
 */