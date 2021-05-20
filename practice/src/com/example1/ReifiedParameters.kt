package com.example1

import java.math.BigDecimal

fun main(args:Array<String>){
    var list= listOf("1",BigDecimal(10.290),"siddarth",BigDecimal(908.728))
    val n=list.getBigDecimal()
    for(num in n){
        println(num)
    }
}

fun <T> List<T>.getBigDecimal():List<T>{
    return this.filter{it is BigDecimal}
}
class ReifiedParameters {
}