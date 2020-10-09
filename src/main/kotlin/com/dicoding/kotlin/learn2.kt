package com.dicoding.kotlin

fun main() {
    val openHours = 7
    val closeHours = 16
    val now = 8

//    val office: String

//    office = if (now > openHours) {
//        "Office already open"
//    } // else if () {}
//    else {
//        "office is closed"
//    }

//    print(office)
    val isOpen = now >= openHours && now <= closeHours
    print("office is open: $isOpen")

}