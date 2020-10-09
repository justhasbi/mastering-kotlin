package com.dicoding.kotlin

fun main() {
    val capital = mapOf(
            "Tegal" to "Jawa Tengah",
            "Semarang" to "Jawa Tengah",
            "Surabaya" to "Jawa Timur"
    )
    println(capital["Tegal"])
    println(capital.getValue("Tegal"))

    val mapKeys = capital.keys
    println(mapKeys)

    val mapValues = capital.values
    println(mapValues)

    // method mapOf() merupakan immutable
    /* untuk mengubah atau menambahkan key-valuekita perlu
    mengonversikannya kedalam bentuk mutable dengan method
    toMutableMap()
     */

    // Mutable map
    val mutableMap = capital.toMutableMap()
    mutableMap["Slawi"] = "Tegal"
    mutableMap["Margasari"] = "Tegal"
    print(mutableMap)
}