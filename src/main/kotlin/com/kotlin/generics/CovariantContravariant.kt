package com.kotlin.generics

// Covariant
/*
     nilai dari tipe parameter tersebut hanya bisa diproduksi seperti
     menjadikanya sebagai return type
 */
interface ListCovariant<out E> : Collection<E> {
    operator fun get(index: Int): E
}

// Contravariant
/*
    bisa dikonsumsi dengan menjadikannya sebagai argumen untuk setiap
    fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi.
 */

interface Comparable<in T> {
    operator fun compareTo(other: T) : Int
}