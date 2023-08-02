package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir "Cizilebilir" (Drawable) arayüzü tanımlayın ve bu arayüzü
    // uygulayan sınıfları (Kalem ve Silgi) oluşturun. Her sınıfın "ciz" metodu olsun.

    kalem().cizme()
    silgi().cizme()
}

interface Drawble{
    fun cizme()
}

class kalem(): Drawble{
    override fun cizme() {
        println("Çizme")
    }
}
class silgi(): Drawble{
    override fun cizme() {
        println("Çiz")
    }
}