package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir HashMap'teki en büyük değeri bulan bir fonksiyon yazın.
    val has1 = mapOf(
        2 to 1,
        3 to 2,
        4 to 3,
        5 to 4
    )
    val enBuyuk = enBuyukDegeriBul(has1)
    println(enBuyuk)
}
fun enBuyukDegeriBul(map: Map<Int, Int>): Int{
    var enBuyukValue = 0
    for (i in map){
        if (i.value > enBuyukValue){
            enBuyukValue = i.value
        }
        else{
            return enBuyukValue
        }
    }
    return enBuyukValue
}