package com.learning.roots.dsprogramsinkotlin

/*Find the count of smaller numbers than given range item*/

fun main() {
    val items = arrayOf(1, 2, 3, 3, 3, 4, 6, 7, 8, 9)
    val length = items.size
    val itemRange = 5
    println("The items count in the range is ${findSmallerNumber(items, length, itemRange)}")
}

fun findSmallerNumber(itemArray: Array<Int>, length: Int, itemRange: Int): Int {
    val count = itemArray.filter { item -> item <= itemRange }.toTypedArray().size
    return count
}