package com.kotlinegitim.algorithmproblems

fun main() {
    //İki listenin elemanlarını birleştirip sıralayan bir fonksiyon yazın
    val birinciListe = listOf<Int>(6,4,8,3,7,5,)
    val ikinciListe = listOf<Int>(1,2,3)
    val toplamListe = birinciListe + ikinciListe
    val sirala = toplamListe.sorted()
    println(sirala)
}