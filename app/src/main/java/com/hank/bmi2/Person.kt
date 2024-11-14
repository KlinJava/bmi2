package com.hank.bmi2

class Person constructor(val name:String, val weight:Float, val height:Float) {
    var idd : Float = 0f
    /*    var weight:Float = 0f
    var height:Flat = 0f*/
    constructor(id:Float, name:String, weight:Float, height:Float):this(name, weight, height){
        this.idd = id
            }

    fun idView() {
        println("id: $idd")
    }
    fun bmi():Float {
        return weight / (height*height)
    }
    fun hello() {
        println("Hello")
    }
}
