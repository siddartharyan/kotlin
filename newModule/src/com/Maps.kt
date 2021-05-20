package com

fun main(args:Array<String>){
    val immutableMap= mapOf(1 to Car("green","toyota",2015),
    2 to Car("red","Ford",2016),
    3 to Car("silver","Honda",2013))

    val mutableMap= mutableMapOf(1 to Car("green","toyota",2015),
        2 to Car("red","Ford",2016),
        3 to Car("silver","Honda",2013)
    )
    mutableMap.put(4,Car("white","audi",2020))
    for((k,v) in mutableMap){
        println("$k  ${v.model}")
    }
    val(color,model,year)=Car("yellow","audi",2020)
    println("$color $model $year")

}

data class Car(val color:String,val model:String,val year:Int){
}