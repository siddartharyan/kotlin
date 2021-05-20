package com
fun main(args:Array<String>){
    Test.list.let{
        for(color in Test.list){
            println(color)
        }
    }
}
open class Bicycle(var cadence:Int,var gear:Int,var speed:Int){
    fun applyBreak(decrement:Int){
        speed-=decrement
    }
    fun speedify(increment:Int){
        speed+=increment
    }
    open fun printDescription(){
        println("The Bike is in $gear and cadence is $cadence and speed")
    }
}

class MountainBike(var seatHeight:Int,cadence: Int,gear: Int,speed: Int):Bicycle(cadence, gear, speed){

    constructor(seatHeight: Int,cadence: Int,gear: Int,speed: Int,color:String):this(seatHeight, cadence, gear, speed){
        println("The color is $color")
    }
    override fun printDescription(){
        println("The Bike has a seat of height $seatHeight")
    }
}

class RoadBike(val tireWidth:Int,cadence: Int,gear: Int,speed: Int):Bicycle(cadence, gear, speed){

    override fun printDescription() {
       println("The Tire has a width of $tireWidth")
    }
}

class Test{
    companion object{
        val list= arrayListOf<String>("blue","red","white","black","green","brown")
    }
}