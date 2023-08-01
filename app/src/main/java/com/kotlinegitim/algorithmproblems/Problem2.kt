package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın
    val sayilar = listOf(4, 2, 3, 4, 9, 7)
    val filtrelenen = filtrele(sayilar)
    println("Tek sayılar: " + filtrelenen)
}
fun filtrele(list: List<Int>): List<Int> {
    val sayilar = mutableListOf<Int>()
    for (sayi in list) {
        if (sayi % 2 != 0) {
            sayilar.add(sayi)
        }
    }
    return sayilar
}