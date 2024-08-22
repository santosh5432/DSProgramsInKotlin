package com.learning.roots.dsprogramsinkotlin

/**
 * Fibonacci series
 */
fun main(){
    fibonacciSeries(10)
}


fun fibonacciSeries(range:Int){
    var items= arrayListOf<Int>()
    for(i in 0 until range){
        if(items.size<2)
        items.add(i)
        else
            items.add(items[items.size-1] +items[items.size-2])
    }

    print(items)

}