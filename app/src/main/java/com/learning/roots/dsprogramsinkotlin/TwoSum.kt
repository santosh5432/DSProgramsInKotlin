package com.learning.roots.dsprogramsinkotlin

/**
 * In progress
 */
fun main() {
    val items = getArray()
    items.forEach {
        println(it)
    }
}

fun getArray(): IntArray {
    val numArray = arrayOf(3, 2, 4)
    val target = 6
    val numCombination = arrayListOf<Int>()
    for (num in numArray) {
        for (i in 1 until numArray.size) {
            if (num + numArray[i] == target) {
                    numCombination.add(numArray.indexOf(numArray[i]))
            }
        }
    }
    return numCombination.toIntArray()
}