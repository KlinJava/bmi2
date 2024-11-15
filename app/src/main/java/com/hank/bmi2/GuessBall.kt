package com.hank.bmi2

class GuessBall:GuessGame() {
    override fun guess(n: Int): Int {
        secret = (20..30).random()
        println("secret2: $secret")
        return secret - n
    }
}