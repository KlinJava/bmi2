package com.hank.bmi2

fun main() {
    // map：有 key+value，無 index，後者相同者會蓋掉前面的
    val drinks = mutableMapOf<Int,String>(
        1 to "Coke",  //寫法等於 Pair(1, "Coke")
        2 to "7-up",
        3 to "Wuloong",
        4 to "Orange"
    )
    println(drinks)
    println("讀取key=3: ${drinks.get(3)}")
    drinks.put(5,"Water")
    println("新增一組kye+value: $drinks")
    drinks.put(5,"Apple")
    println("key相同，值被改變： $drinks")


/*    val drinks = HashMap<Int,String>()
    drinks.put(1,"Coke")
    drinks.put(2,"7-up")
    drinks.put(3,"Wuloong")*/

}