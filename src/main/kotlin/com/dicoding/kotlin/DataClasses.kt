package com.dicoding.kotlin

class User(val name: String, val age: Int)

// menentukan behaviour dalam data class
data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("nama saya $name, umur saya $age tahun")
    }
}

fun main() {
    //  val user = User("hasbi", 22)
    val datauser = DataUser("Shuhada", 21)

    //  println(user)
    //  println(datauser)

    //  copy data using copy() function
    val dataUserCopy = datauser.copy(name = "Shuhada")
    println(dataUserCopy)

    //  Destructuring Declarations
    val name = dataUserCopy.component1()
    val age = dataUserCopy.component2()
    println("nama saya $name, umur saya $age tahun")

    //  bentuk lain, membuat beberapa var
    val (name1, age1) = dataUserCopy
    println("nama saya $name1, umur saya $age1 tahun")
    //  call intro function inside data class DataUser()
    datauser.intro()
}