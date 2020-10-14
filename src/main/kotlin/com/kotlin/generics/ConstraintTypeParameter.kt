package com.kotlin.generics
import com.kotlin.generics.List as list


// Constrain Type Parameter
class ListNumber<T : Number> : list<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

// fun <T: Number> List<T>.sumNumber() : T {

// }
fun main() {
    val numbers1 = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
}