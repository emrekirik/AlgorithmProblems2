package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir SetOf'taki elemanları diğer bir SetOf'tan çıkaran bir fonksiyon yazın
    //inline fonksiyon : return yerine eşittir kullanarak tek satırlık fonksiyon yapmaktır.
    val list = setOf<Int>(1,2,3,4,5,6)
    val list2 = setOf<Int>(1,2,3)
    val cikarma = cikarma(list, list2)
    println(cikarma)

}
fun <T> cikarma(set1: Set<T>, set2: Set<T>): Set<T> {
    return set1 - set2
}