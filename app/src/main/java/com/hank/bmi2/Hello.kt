package com.hank.bmi2

class Hello {

}

fun main() {
    val p = Person("Jack123",65.5f,1.7f)
    p.hello()
    println(p.bmi())
    val hank = Person("Hank",70f,1.75f)
    val Mary = Person(1f, "Mary",66f,1.6f)
    println("${p.name}\t${p.bmi()}")
    println("${hank.name}\t${hank.bmi()}")
    println(Mary.idd)

    println(p.name.nameLength())

//    bmiTest()
//    println("Hello Kotlin!")
//    dataType()

}

fun String.nameLength():Int{
    return this.length
}

private fun bmiTest() {
    //BMI
    val w = 65.5f
    val h = 1.7f
    val bmi = w / (h * h)
    println("BMI: $bmi") // 等於 println("BMI: " + bmi)
}

private fun dataType() {
    //Byte, Short, Int, Long
    val age: Int = 20
    val population: Long = 9999L
    println(age.inc())
    println(age)
    var name = "Hank"
    println(name.get(1))
    name = "Jack"
    println(name)
    //Float(32), Double(64)
    val weight: Float = 65.5f
    //true, false
    val isAdult = false
    val c = 'A'
    println(c)
}