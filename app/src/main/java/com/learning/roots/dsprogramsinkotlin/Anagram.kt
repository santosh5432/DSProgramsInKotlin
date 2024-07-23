package com.learning.roots.dsprogramsinkotlin

/**
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different
 */
fun main() {
    val str1 = "anagram"
    val str2 = "managra"

    print(
        if (isAnagram(str1, str2)) "Anagram"
        else "Not Anagram"
    )
}

fun isAnagram(first: String, second: String): Boolean {
    val firstStringMap: HashMap<Char, Int> by lazy {
        hashMapOf()
    }

    val secondStringMap: HashMap<Char, Int> by lazy {
        hashMapOf()
    }

    if (first.length != second.length)
        return false
    else {

        first.forEach {
            if (!firstStringMap.containsKey(it))
                firstStringMap[it] = first.count { char -> char == it }
        }

        second.forEach {
            if (!secondStringMap.containsKey(it))
                secondStringMap[it] = second.count { char -> char == it }
        }
    }
    return firstStringMap == secondStringMap
}