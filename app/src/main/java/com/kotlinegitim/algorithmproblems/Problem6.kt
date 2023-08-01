package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir HashSet'in belirli bir elemanı içerip içermediğini kontrol eden bir fonksiyon yazın.
    val list = hashSetOf(1,2,3,5,8,6)
    val secilenEleman = 8
    val belirtilenEleman = belirtilenElmaniAl(list,secilenEleman)
    if (belirtilenEleman == true) {
        println("Seçilen eleman listede var : " + secilenEleman )
    }
}

fun belirtilenElmaniAl(set: HashSet<Int>, element: Int): Boolean{
    return set.contains(element)

}