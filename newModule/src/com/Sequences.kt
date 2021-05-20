package com
fun main(args:Array<String>){
    val immuatbleMap=mapOf(1 to Car("green","toyota",2015),
    2 to Car("red","Ford",2016),
    3 to Car("silver","Honda",2013),
    17 to Car("red","BMW",2015),
    8 to Car("green","Ford",2010))
    println(immuatbleMap.filter{it.value.model=="Ford"}.map{it.value.color})

    //sequences search for terminal operation
    val list= listOf("Joe","Mary","Jane")
    println(list.asSequence().filter{it[0]=='J'}.map{it.toUpperCase()}.toList())
}