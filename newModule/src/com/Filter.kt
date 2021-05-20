package com

fun main(args:Array<String>){
    val set= setOf(2,4,5,6,1,9)
    val map= mapOf(1 to Car("green","toyota",2015),
        2 to Car("red","Ford",2016),
        3 to Car("silver","Honda",2013))
    println(set.filter{it->it%2!=0})
    println(map.filter{it->it.value.year==2016}.toString())
    val list= listOf(1,2,3,4,5)
    val mutableList= list.map{it->it+10}
    println(mutableList)
    println(mutableList.all{it>20})
    println(mutableList.any { it%2==0 })
}