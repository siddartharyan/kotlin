package com.example1


fun main(args:Array<String>){
    val list= listOf("1","2","3","4","5")
    list.convertToIntandPrint()

    val list1:Any= listOf("str1","str2","str3")
    //star projection
    if(list1 is List<*>){

    }
}

fun <T:String> List<T>.convertToIntandPrint(){
    val convertedList=this.map{it.toInt()}
    for(num in convertedList){
        println(num)
    }
}
class GenericErasure {
}