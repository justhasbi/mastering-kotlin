package com.oop.kotlin

class AnimalGetterSetter {
    var name: String = "Gecko Licker"

    get() {
        println("Fungsi Getter Terpanggil")
        // mengembalikan nilai dari properti terkait yaitu $name
        return field
    }

    set(value) {
        println("Fungsi Setter Terpanggil")
        field = value
    }
}

fun main() {
    val geckoLicker = AnimalGetterSetter()
    println("Name: ${geckoLicker.name}")

    geckoLicker.name = "Gecko Mimic"
    println("Name: ${geckoLicker.name}")
}