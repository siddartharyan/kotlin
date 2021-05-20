package com


fun main(args:Array<String>){
    var list= mutableListOf("hello")
    list.add("another")
    val k=list[0].toUpperCase()
    println(k)
    printCollection(list)
    val bdList= mutableListOf(-567.9200,-8299.6627,7828.9020)
    printCollection(bdList)
    list.print()
    bdList.print()
}

fun <T> printCollection(collection:List<T>){
    for(item in collection){
        println(item)
    }
}

fun <T> List<T>.print(){
    for(num in this){
        println(num)
    }
}
class Generics {
}