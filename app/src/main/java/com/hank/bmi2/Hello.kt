package com.hank.bmi2

class Hello {

}

fun main() {
    val p = Person()
    p.hello()



    println("Hello Kotlin!")
    //Byte, Short, Int, Long
    val age:Int = 20
    val population:Long = 9999L
    println(age.inc())
    println(age)
    var name = "Hank"
    println(name.get(1))
    name = "Jack"
    println(name)
    //Float(32), Double(64)
    val weight:Float = 65.5f
    //true, false
    val isAdult = false
    val c = 'A'
    println(c)


}