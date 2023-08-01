package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın
    val list = hashSetOf(1,2,3,5,8,6)
    val toplamListe = hashlistleriToplama(list)
    println(toplamListe)
}
fun hashlistleriToplama(list: HashSet<Int> ): HashSet<Int>{
    val toplamListe = HashSet<Int>()
    for (i in list){
        toplamListe.add(i)
    }
    return toplamListe

}