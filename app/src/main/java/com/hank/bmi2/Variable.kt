package com.hank.bmi2

fun main() {
    //challeng，亂數 + 地雷
    val nums = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    nums.shuffle()  //打亂、洗牌
    val secret = nums.removeAt(0) // bingo號碼
    val bomb = nums.removeAt(1) // 地雷
    println(nums)
    println(secret)
    println(bomb)

    //List
    val list = listOf<Int>(2,5,8) //immutable
    println(list)
    val mulist = mutableListOf<Int>(1,3,5) //mutable
    println("mulist: $mulist")
    mulist.add(9)
    println("add 9 to mulist: $mulist")
    mulist.removeAt(1)
    println("remote index1 in mulist: $mulist")
    mulist.set(1,88)
    println("replace index1 to mulist: $mulist")

//    checknull()
//    primitiveDataType()
//    arrayFor()
}

private fun checknull() {
    var name: String? = "Hank"
    println(name?.length)
    println(name ?: 0)
}

private fun primitiveDataType() {
    var counter = 0
    var counter2 = 10
    counter++ // 等於 counter = counter+1
    counter2-- // 等於counter2 = counter2-1
    println("counter+1: $counter")
    println("counter2-1: $counter2")
    println("10/3餘數:" + 10 % 3)
    println("10/3整數相除:" + 10 / 3) //整數/整數 = 整數
    println(10 / 3.0)
    //Boolean
    var b = false
    var a = true
    println(!b)
    println(a && b)
    println(a || b)
    println()
    val num = -8
    println(num <= 5 && num >= 3)
    println(num > 5 || num < -3)
}
private fun arrayFor() {
    //Array
    val array = intArrayOf(2, 5, 8)
    println(array[2])
    val ss = arrayOf("SUN", "MON", "TUE")
    println(ss.size)
    println(ss.get(2))
    for (day in ss) {
        println(day)
    }

    //For
    val range = 0..10
    for (i: Int in 1..30) {
        if (i % 2 == 1) {
            print("*")
        } else {
            print(" ")
        }
    }
    println()
    for (i in 1..10 step 2) print("\t$i")
    println()
}

