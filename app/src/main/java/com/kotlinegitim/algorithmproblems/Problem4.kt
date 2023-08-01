package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir listedeki elemanları tersine çeviren bir fonksiyon yazın.

    val list = listOf<Int>(5,7,3,7,8,3)
    val tersListe = elemanlariTersineCevir(list)
    println("Normal liste : " + list + "Tersine Liste : " + tersListe  )
}
fun elemanlariTersineCevir(list: List<Int>): List<Int>{
    val tersineListe = list.reversed()
    return  tersineListe
}