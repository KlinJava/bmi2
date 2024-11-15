package com.hank.bmi2

open class GuessGame {
    //    var secret:Int = Random.nextInt(1,11)
    var secret:Int = (1..10).random()
    var counter = 0
    open fun guess(n:Int):Int{
        println("secret: $secret")
        counter++
        return secret - n
    }
    open fun reset() {
        secret = (1..10).random()
        counter = 0
    }
}