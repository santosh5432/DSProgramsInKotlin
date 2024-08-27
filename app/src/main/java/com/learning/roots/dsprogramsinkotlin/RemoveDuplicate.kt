package com.learning.roots.dsprogramsinkotlin

/**
 * Remove duplicate numbers from integer array
 */
fun main() {
    val length = 8
    val itemArray = arrayOf(2, 2, 3, 3, 4, 4, 5, 8)
    val itemCount = removeDuplicateNumbers(length, itemArray)
    println("After deleting duplicate now list items are $itemCount")
}

fun removeDuplicateNumbers(length: Int, items: Array<Int>): Int {
    val list = items.toMutableList()
    for (i in 0 until length) {
        val count = list.count { it == items[i] }
        if (count > 1)
            list.remove(items[i])
    }
    return list.size
}