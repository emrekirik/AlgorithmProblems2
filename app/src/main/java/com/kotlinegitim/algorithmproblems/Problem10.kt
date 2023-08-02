package com.kotlinegitim.algorithmproblems

fun main() {
    //Verilen iki HashMap'in kesişimini bulan bir fonksiyon yazın.
    val kullanicilar = mapOf(
        "Emre Kirik" to 8537673,
        "Okan Çankaya" to 3971883,
        "Berke Duran" to 2720546,
        "Emirhan Kılıç" to 2296224
    )
    val kullanicilar2 = mapOf(
        "Gamze Demir" to 4587673,
        "Okan Çankaya" to 3971883,
        "Salih Yılmaz" to 7740549,
        "Emirhan Kılıç" to 2296224
    )
    val kesisimBulma = kesisimBulma(kullanicilar, kullanicilar2)
    println(kesisimBulma)
}
fun <K, V> kesisimBulma(map1: Map<K, V>, map2: Map<K, V>): Map<K, V>{
    val kesisim = mutableMapOf<K, V>()

    for ((key, value) in map1) {
        if (map2.containsKey(key)) {
            kesisim[key] = value
        }
    }

    return kesisim
}