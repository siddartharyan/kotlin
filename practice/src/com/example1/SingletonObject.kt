package com.example1

import java.time.Year

fun main(args:Array<String>){
    println(Singleton.getYear())
    println(Variable.getPrivateVar())
}


//singleton instance
object Singleton{
    val nowYear=Year.now().value
    fun getTagline()="Siddarth"
    fun getYear():Int=nowYear
}

//companion object
class Variable{
    companion object{
        private var privateVar=6
        fun getPrivateVar()= privateVar
    }
}
class Interface {
}