package com.oop.kotlin

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
    }
}

class AnimalDelegateProperty {
    // delegate menggunakan keyword by
    var name: String by DelegateName()
}

class PersonDelegateProperty {
    var name: String by DelegateName()
}

class HeroDelegateProperty {
    var name: String by DelegateName()
}

// Property Delegate using Any
class DelegateGenericClass {
    private var value: Any = "Default"
    operator fun getValue(classRef: Any, property: KProperty<*>) : Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalAny {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    val animal = AnimalDelegateProperty()
    animal.name = "Mori Miaw"
    println(animal)

    val person = PersonDelegateProperty()
    person.name = "Hasbi Shuhada"
    println(person)

    val hero = HeroDelegateProperty()
    person.name = "Iron Man"
    println(hero)

    println("=====================")
    val animalAny = AnimalAny()
    animalAny.name = "Dicoding cat"
    animalAny.weight = 6.2
    animalAny.age = 1

    println("Nama: ${animalAny.name}")
    println("Berat: ${animalAny.weight}")
    println("Umur: ${animalAny.age} Tahun")
}