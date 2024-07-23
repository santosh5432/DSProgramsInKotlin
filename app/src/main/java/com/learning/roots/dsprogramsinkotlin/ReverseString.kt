package com.learning.roots.dsprogramsinkotlin

/**
 * Reverse the string
 */
fun main() {
    val name = "vadaY hsotnaS"
    val reverseString = reversString(name.toCharArray())
    println(reverseString)
}

fun reversString(name: CharArray): String {
    var reverseString= ""
    for (i in name.size - 1 downTo 0) {
       reverseString+=name[i]
    }
    return reverseString
}