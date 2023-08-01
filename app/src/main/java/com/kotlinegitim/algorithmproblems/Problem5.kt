package com.kotlinegitim.algorithmproblems

fun main() {
        //Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.
    val list = listOf<Int>(5,7,3,7,8,3)
    println("Tekrar eden : " + hashSetListe(list))

}
fun hashSetListe(list: List<Int>): HashSet<Int> {

    val tekrarEden = HashSet<Int>()
    val tekrarEtmeyen = HashSet<Int>()

    for (i in list){
        if (!tekrarEtmeyen.add(i)){
            tekrarEden.add(i)
        }
    }
    return tekrarEden

}