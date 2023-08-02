package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.
    val has1 = mapOf(
        2 to 1,
        3 to 2,
        4 to 3,
        5 to 4
    )
    val topla = topla(has1)
    println(topla)
}
fun topla(map: Map<Int, Int>): Int{
    var toplam = 0
    for (i in map){
        toplam += i.value
    }
    return toplam
}
