package com.example1

fun main(args:Array<String>){
    val shortList=listOf<Short>(1,2,3,4)
    convertToInt(shortList)
}

fun convertToInt(collection:List<Number>){
    for(num in collection){
        println("number is ${num.toInt()}")
    }
}
class CoVariance {
}