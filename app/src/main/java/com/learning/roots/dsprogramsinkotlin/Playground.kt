package com.learning.roots.dsprogramsinkotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
//    var sum={a:Int,b:Int -> a+b}
//    println(sum(9,4))

//    println(
//        calculation(5,10) { a, b -> a + b }
//    )

//    runBlocking {
//        var temp = 0
//        fetchData().map { it * 2 }.collect { value ->
//            temp = value
//            println(temp)
//        }
//
//    }
    counter()

}


//fun calculation(a:Int,b:Int,operation:(Int,Int)->Int):Int{
//return operation(a,b)
//}

fun fetchData(): Flow<Int> {
    return flow {
        for (i in 1..5) {
            delay(1000)
            emit(i)
        }
    }
}

fun counter(){
    runBlocking {
        launch {
            for(i in 1..10) {
                println(i)
                delay(1000)
            }
        }
    }
}
