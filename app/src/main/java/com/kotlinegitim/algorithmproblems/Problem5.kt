package com.kotlinegitim.algorithmproblems

fun main() {
        //Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.
    val list = listOf<Int>(5,7,3,7,8,3)
    println("Normal liste : " + list)
    val duzeltilmisListe = hashSetListe(list)
    println("Düzeltilmiş Liste : " + duzeltilmisListe)

}
fun hashSetListe(list: List<Int>): HashSet<Int> {
    val duzeltilmisListe = list.toSet().toHashSet()
    return duzeltilmisListe
}