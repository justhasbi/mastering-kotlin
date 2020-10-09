package com.dicoding.kotlin

// Kotlin collection
fun main() {
    // ---Fold -> fold()
    // melakukan perhitungan nilai dalam collection tanpa iterasi
    /*  fold() memerlukan dua argumen yaitu nilai awal perhitungan dan lambda
        expression yang nilai kembaliannya digunakan untuk menentukan nilai awal
        selanjutnya. Didalam lambda expression juga memiliki dua argumen yaitu,
        argumen current -> nilai awal, argumen item -> masing-masing ponilai
        dalam numbers.
     */

    // fold()
    val numbers = listOf(1,2,3,5,7,10)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("fold result $fold")
    println("-------------")

    // foldRight()
    // melakukan iterasi dari indeks akhir dan posisi argumen lambda ditukar

    val foldRightEx = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("fold result $foldRightEx")

    // ---Drop -> drop()
    // memotong item dalam collection
    val number = listOf(1,3,5,7,8,10)
    val drop = number.drop(3)
    println(drop)
    // dropLast() -> memotong dari belakang
    val dropLast = number.dropLast(3)
    println(dropLast)

    // ---Take
    // menyaring nilai collection dan membentuk collection baru
    val total = listOf(1,2,3,4,5,6,10,4,5,2,11)
    val take = total.take(3)
    println(take)
    val takeLast = total.takeLast(3)
    println(takeLast)

    // ---Distinct
    // menyaring nilai yang sama dalam collection
    val distinct = total.distinct()
    println(distinct)

    // data class call
    val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "Is"),
            Item("3", "Awesome"),
            Item("3", "As F*"),
    )
    // distinctBy untuk menentukan parameter penyaringan berdasarkan apa
    // menggunakan it untuk mengambil element dari context
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach { println("${it.key} with value ${it.value}") }

    // another example of distinct function
    val textDistinct = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val itemDistinct = textDistinct.distinctBy { it.length }
    println(itemDistinct)

    // ---Chunked
    // memecah string dalam bagian array
    val word = "HASBI SHUHADA"
    val chunkedWord = word.chunked(3)
    val chunkedWordTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedWordTransform)
}


// data class
data class Item(val key: String, val value: Any)
