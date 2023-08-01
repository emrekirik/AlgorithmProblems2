package com.kotlinegitim.algorithmproblems

fun main() {
    val sayilar = listOf(4, 2, 8, 4, 9)
    val toplam = topla(sayilar)
    println("Listedeki tüm sayıların toplamı: " + toplam)
}

fun topla(list: List<Int>): Int {
    var toplam = 0
    for (i in list) {
        toplam += i
    }
    return toplam
}

