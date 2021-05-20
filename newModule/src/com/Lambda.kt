package com

fun main(args:Array<String>){
    val employees= listOf<Employee>(Employee("John","Smith",2012)
    ,Employee("James","Arnold",2011),
    Employee("Sai","Siddartha",2021))
    println(employees.minOf{ e ->e.startYear })
}

data class Employee(val firstName:String,val lastName:String,val startYear:Int){

}