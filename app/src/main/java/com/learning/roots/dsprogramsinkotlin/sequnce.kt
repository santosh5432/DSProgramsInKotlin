package com.learning.roots.dsprogramsinkotlin

/**
 * Iterate the array from given element
 * to end of array and to start of array
 * until you didn't find the element again
 */

fun main() {
    val items = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val input = 3
    traversing(input, items)
}

fun traversing(input: Int, items: Array<Int>) {

    for(k in items.indexOf(input) until items.size) {
        var itemArray = arrayListOf<Int>()
        val inputItem= items[k]
        for (i in items.indices) {
            if (items.indexOf(items[i]) >= items.indexOf(inputItem)) {
                itemArray.add(items[i])
            }
        }
        for (j in items.indices) {
            if (items.indexOf(items[j]) < items.indexOf(inputItem)) {
                itemArray.add(items[j])
            }
        }
        println(itemArray)
    }

}