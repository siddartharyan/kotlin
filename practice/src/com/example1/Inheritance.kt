package com.example1


fun main(args:Array<String>){
}
class Inheritance {

}

abstract class Printer(val modelName:String){
    open fun printModel():String="The printer model is $modelName"
    abstract fun getPrice():Double
}
open class LaserPrinter(modelName:String):Printer(modelName){
    override fun printModel(): String="The LaserPrinter is $modelName"
    override fun getPrice(): Double =100.82892
}
class SpecialLaserPrinter(modelName: String):LaserPrinter(modelName){

}