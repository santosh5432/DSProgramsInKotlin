package com.learning.roots.dsprogramsinkotlin

/**
 * Palindrome string
 */
fun main(){

    val str="addas"
    val palindrome= palindrome(str)
    if(palindrome)
        print("String is palindrome")
    else
        print("String is not palindrome")

}

fun palindrome(input:String): Boolean{
    val reversStr= reverseString(input.toCharArray())
    return reversStr==input
}

fun reverseString(str:CharArray):String{
    var reverseString=""
    for(i in str.size-1 downTo 0)
        reverseString+=str[i]

    return reverseString
}