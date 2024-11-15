package com.hank.bmi2

fun main() {
    val game = GuessGame()
    val num = 3
    val result = game.guess(num)
    println(result)
    val ball = GuessBall()
    println(ball.guess(num))

}