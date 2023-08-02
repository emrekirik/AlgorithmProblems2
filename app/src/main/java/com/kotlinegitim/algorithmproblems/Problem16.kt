package com.kotlinegitim.algorithmproblems

fun main() {
    //Geometrik şekilleri temsil eden bir arayüz (Shape) ve
// bu arayüzü uygulayan iki sınıf (Dikdortgen ve Daire) tanımlayın.
// Her şekil için alanı hesaplayacak bir metot olsun
    val dikdortgen = Dikdortgen(5.0, 3.0)
    val daire = Daire(4.0)

    println("dikdörtgen alanı : " + dikdortgen.hesaplaAlan())
    println("daire alanı : " + daire.hesaplaAlan())

}

interface Shape{
    fun hesaplaAlan(): Double
}

class Dikdortgen(val uzunluk: Double, val genislik: Double): Shape{

    override fun hesaplaAlan(): Double {
        return uzunluk * genislik
    }

}
class Daire(val yariCap: Double): Shape{
    override fun hesaplaAlan(): Double {
        return 3.14 * yariCap * yariCap
    }
}
