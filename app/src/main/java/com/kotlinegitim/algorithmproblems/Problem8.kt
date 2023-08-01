package com.kotlinegitim.algorithmproblems

fun main() {
    //Verilen bir listeyi SetOf olarak döndüren bir fonksiyon yazın (tekrar eden elemanları çıkarır).
    val list = listOf<Int>(5,7,3,7,8,3)
    val tekrarEdenleriCikar = tekrarEdebleriCikar(list)
    println(tekrarEdenleriCikar)
}
fun <T> tekrarEdebleriCikar(list: List<T>): Set<T> {
    return list.toSet()
}