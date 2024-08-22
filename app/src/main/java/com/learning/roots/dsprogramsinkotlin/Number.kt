package com.learning.roots.dsprogramsinkotlin

/**
 * Largest and second largest number
 */
fun main() {
 largestNumber()
}

fun largestNumber() {
    val array: IntArray = intArrayOf(11, 2, 30, 49, 15, 5)
    array.sortDescending()
    for (item in array)
        println(item)
    array.let {
        println("Largest number is ${it[0]}")
        println("Second Largest number is ${it[1]}")
    }
}

