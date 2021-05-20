package com

import java.lang.StringBuilder

fun main(args:Array<String>){
    println(countTo100())
    println(countto100())
    println(Countto100())
}
fun countTo100():String{
    var ans=StringBuilder()
    return with(ans){
        for(num in 1..99){
            append(num)
            append(',')
        }
        append(100)
    }.toString()
}

fun countto100():String=
    with(StringBuilder()){for(num in 1..99){append(num)
    append(',')}
    append(100) }.toString()

fun Countto100():String=StringBuilder().apply(){
    for(num in 1..99){
        append(num)
        append(',')
    }
    append(100)
}.toString()