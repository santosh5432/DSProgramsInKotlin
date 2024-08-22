package com.learning.roots.dsprogramsinkotlin

/**
 * Find duplicate or repeated characters in String
 */

fun main() {
    val name = "android development, I am loving it"
    val nameArray = name.map { it }
    val duplicateMap = hashMapOf<Char, Int>()

    nameArray.forEach {
        val count = nameArray.count { char -> char == it }
        if (!duplicateMap.containsKey(it))
            duplicateMap[it] = count
    }

    duplicateMap.filter { it.value > 1 && !it.key.isWhitespace() }.forEach { (key, value) ->
        println("$key $value")
    }

}

