package com.example1


enum class Department(val departmentName:String,val numOfEmployees:Int){
    HR("Human Resources",5),IT("Information Technology",10),ACCOUNTING("Accounting",10),SALES("Sales",12);
    fun getDetails():String="The Department Name is $departmentName and number of Employees $numOfEmployees"
}
fun main(args:Array<String>){
    println(Department.IT.getDetails())
}