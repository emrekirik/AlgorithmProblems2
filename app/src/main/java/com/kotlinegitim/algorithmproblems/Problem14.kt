package com.kotlinegitim.algorithmproblems

import kotlin.math.max

fun main() {

    ////Bir HashMap'teki en büyük değeri ve keyi bulan bir fonksiyon yazın.
    val has1 = mapOf(
        2 to 1,
        3 to 2,
        4 to 3,
        5 to 4
    )
    val maxKeyValue = maxValue(has1)
    println(maxKeyValue)
}

fun maxValue(map: Map<Int, Int>): HashMap<Int, Int> {

    val maxValue = hashMapOf<Int, Int>()
    val max = map.values.max()

    for (i in map){
        if (i.value == max){
            maxValue.put(i.key, i.value)
        }
    }
    return maxValue
}