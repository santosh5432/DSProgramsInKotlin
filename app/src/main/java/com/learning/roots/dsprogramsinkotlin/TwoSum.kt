package com.learning.roots.dsprogramsinkotlin

/*In Progress*/
fun main() {
    val items = getArray()
    items.forEach {
        println(it)
    }
}

fun getArray(): IntArray {
    val numArray = arrayOf(3, 2, 4)
    val target = 6
    var numCombination = arrayListOf<Int>()
    for (num in numArray) {
        for (i in 1 until numArray.size) {
            if (num + numArray[i] == target) {
                    numCombination.add(numArray.indexOf(numArray[i]))
            }
        }
    }
    return numCombination.toIntArray()
}