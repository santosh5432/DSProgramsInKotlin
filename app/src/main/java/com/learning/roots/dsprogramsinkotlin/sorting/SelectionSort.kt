package com.learning.roots.dsprogramsinkotlin.sorting

/**
 * Selection Sort
 */
fun main() {
    val arrayInt = arrayOf(12, 3, 56, 78, 44, 2, 34)
    val sortedArray = selectionSort(arrayInt.toIntArray())
    sortedArray.forEach {
        println(it)
    }
}

fun selectionSort(items: IntArray): IntArray {
    for(i in items.indices){
      for(j in items.indices){
         if(items[i]<items[j]) {
             val temp=items[i]
             items[i]=items[j]
             items[j]=temp
         }
      }
    }

    return items
}

