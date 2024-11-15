package com.hank.bmi2

fun main() {
    set()
//    list()
//    poker()

}

private fun set() {
    //set：無 index，不可重複、無順序
    val set = setOf<Int>(5, 3, 9, 3, 2, 1, 9)
    println(set)
    set.forEach {
        print(it)
    }
    println()
    for (n in set) print(n)
}

private fun list() {
    //list：有 index,值可重複,有順序
    val list = listOf<Int>(5, 3, 8, 5, 3, 2)
    println(list)
}

private fun poker() {
    //Club,Diamond,Heart,Spade
    //C,D,H,S
    val deck = mutableListOf<Int>()
    // for (i in 0..< 52)
    for (i in 0 until 52) {
        deck.add(i)
        if (i % 13 == 0 && i != 0) println() //13張跳一行
        val a = i / 13 //取「商」調整「花色」
        var type = when (a) {
            0 -> "♣" //C
            1 -> "♢" //D
            2 -> "♥" //H
            else -> "♤" //S
        }
        print("${(i % 13) + 1}$type ") //調整牌面數字 1-13
        /*        var type = if (a == 0) {
                    "C"
                } else if (a == 1) {
                    "D"
                } else if (a == 2) {
                    "H"
                } else "S"*/
    }
    println()
    println(deck)
    val deck2 = deck.shuffled() // 新的一副牌
    println(deck2)
//    deck.shuffle() //原來的 list 打亂
    println(deck)

}
