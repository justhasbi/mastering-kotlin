package com.dicoding.kotlin

fun main () {
    // mengambil nilai Color kemudian dimasukan kedalam array
    // menggunakan values() untuk mendapatkan atribut objek enum
    val colors: Array<Color> = Color.values()
    // print menggunakan forEach
    colors.forEach { color -> println("$color, ") }

    // menggunakan valuesOf() untuk mendapatkan nama dari objek enum
    val colors2: Color = Color.valueOf("GREEN")
    println("Color is $colors2");
    println("============================")
    // mendapatkan nilai dan nama objek menggunakan enumValue() dan enumValueOf()
    val colorEnumValue: Array<Color> = enumValues()
    colorEnumValue.forEach { color -> println(color) }

    val color3: Color = enumValueOf("BLUE")
    println("Color is $color3")

    val colorOrdinalBlue: Color = Color.BLUE
    println("posisi $colorOrdinalBlue adalah ${colorOrdinalBlue.ordinal}")

    // melakukan pengecekan instance dari enum, menggunakan When expression
    when(colorOrdinalBlue){
        Color.RED -> print("Color Is RED")
        Color.GREEN -> print("Color Is GREEN")
        Color.BLUE -> print("Color Is BLUE")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}