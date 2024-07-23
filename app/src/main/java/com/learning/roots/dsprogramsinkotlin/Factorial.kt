package com.learning.roots.dsprogramsinkotlin

/**
 * Factorial of given number
 */
fun main() {
    val num = 2
    println(getFactorial(num))
}

fun getFactorial(number: Int): Int {
    var factorial = 1
    for (i in number downTo 1)
        factorial *= i
    return factorial
}