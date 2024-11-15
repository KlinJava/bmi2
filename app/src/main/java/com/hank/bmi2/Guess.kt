package com.hank.bmi2

import kotlin.random.Random
//import java.util.Random

fun main() {

//    val secret2 = (1..10).random()
//    val secret = Random().nextInt(10)+1 //java的 Random， 產生 0-9 +1的亂數
    val secret = Random.nextInt(1,11) //kotlin的 Random，不包含11，產生亂數 1-10
    var num = 0
    println(secret)
//    while (num != secret) {
    var bingo = false
    for (i in 1..3) {
        print("Please enter a number(1-10):($i/3)")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered：$num")
        val message = when {
            num < secret -> "Bigger"
            num > secret -> "Smaller"
            else -> {
                bingo = true
                "You got it ,the number is $num" //要回傳的「放最後一行」
            }
        }
        if (bingo) {
            println(message)
            break
        }
/*        if (num < secret) {
            println("Bigger")
        } else if(num > secret) {
            println("Smaller")
        } else {
            println("You got it.")
            bingo = true
            break // 給 for loop用
        }*/
    }
    if (!bingo) println("沒猜中,the secret $secret")
}