package com.example1

fun main(args:Array<String>){
    wantSomeInterface(object:SomeInterface{
        override fun mustImplement(num: Int): String ="The answer is ${num*10}"
    })
}

interface SomeInterface{
    fun mustImplement(num:Int):String
}

fun wantSomeInterface(si:SomeInterface){
    println(si.mustImplement(22))
}