package com.example1
typealias Integer=Int
//modifier kotlin java
//private visibile within the samefile | can't be used
//protected can't be used | can't be used
//public visible everywhere | visible everywhere
//internal same module | N/A

internal fun fact(num:Int):Int=if(num==0) 1 else num*fact(num-1)

fun printFun(label:String, vararg cars:Car){
    for(c in cars){
        println("${label} $c")
    }
}

fun String.uppercaseFirstandLast():String{
    var result=this.substring(0,1).toUpperCase()+this.substring(1,this.length-1)+this.substring(this.length-1,this.length).toUpperCase()
    return result
}
fun main(args:Array<String>){
    val emp:Employee= Employee("siddarth")
    val emp1:Employee=Employee("siddarth",false)
    println(emp.getFirstName())
    emp.setFirstName("sai")
    println(emp.getFirstName())
    val car=Car("green","toyota",2016)
    val car1=Car("red","tata",2020)
    val car2=Car("yellow","audi",2021)
    val arr=arrayOf(car,car1,car2)
    printFun("car is",*arr)

    val text:String="sai siddartha"
    println(text.uppercaseFirstandLast())

}

//class Employee constructor(firstName:String){
//    val firstName:String=firstName
//}
//class Employee(val firstName:String){
//
//    var fullTime:Boolean=true
//    //secondary constructor
//    constructor(firstName: String,fullTime:Boolean):this(firstName){
//        this.fullTime=fullTime
//    }
//}

class Employee{
    private var firstName:String?=null
    private var fullTime:Boolean=true
    constructor(firstName:String){
        this.firstName=firstName
    }
    constructor(firstName: String,fullTime:Boolean){
        this.firstName=firstName
        this.fullTime=fullTime
    }
   fun getFirstName():String?{
       return this.firstName
   }
    fun setFirstName(firstName:String):Unit{
        this.firstName=firstName
    }
}

data class Car(val color:String,val model:String,val year:Int){

}