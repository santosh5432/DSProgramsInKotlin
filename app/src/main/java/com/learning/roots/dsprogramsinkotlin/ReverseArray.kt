package com.learning.roots.dsprogramsinkotlin

/**
 * Reverse the given integer array
 */
fun main() {
    val items = arrayOf(1, 2, 5, 6, 7, 8, 9)
    val length = items.size
    val reverseArray = reversArray(items, length)
    reverseArray.forEach { item->
        print("$item ")
    }
}

fun reversArray(items: Array<Int>, length: Int):Array<Int> {
    val listItem = arrayListOf<Int>()
    for (i in length - 1 downTo 0) {
    listItem.add(items[i])
    }
    return listItem.toTypedArray()
}