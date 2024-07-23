package com.learning.roots.dsprogramsinkotlin.sorting

/**
 * Merge Sort
 */

fun main() {
    val unsortedArray = intArrayOf(60, 51, 32, 8, 71, 22, 14)
    val sortedArray = mergeSort(unsortedArray)
    println(sortedArray.contentToString())
}


fun mergeSort(array: IntArray): IntArray {
    if (array.size <= 1) return array

    val middleIndex = array.size / 2
    val leftHalf = array.slice(0 until middleIndex).toIntArray()
    val rightHalf = array.slice(middleIndex until array.size).toIntArray()

    return merge(mergeSort(leftHalf), mergeSort(rightHalf))
}

fun merge(left: IntArray, right: IntArray): IntArray {
    val merged = IntArray(left.size + right.size)
    var leftIndex = 0
    var rightIndex = 0
    var mergedIndex = 0

    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
            merged[mergedIndex] = left[leftIndex]
            leftIndex++
        } else {
            merged[mergedIndex] = right[rightIndex]
            rightIndex++
        }
        mergedIndex++
    }

    while (leftIndex < left.size) {
        merged[mergedIndex] = left[leftIndex]
        leftIndex++
        mergedIndex++
    }

    while (rightIndex < right.size) {
        merged[mergedIndex] = right[rightIndex]
        rightIndex++
        mergedIndex++
    }

    return merged
}
