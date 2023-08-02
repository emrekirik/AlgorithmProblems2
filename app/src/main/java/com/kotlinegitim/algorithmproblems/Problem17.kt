package com.kotlinegitim.algorithmproblems

fun main() {
    //Bir "Calisan" (Employee) arayüzü oluşturun ve bu
    // arayüzü uygulayan sınıfları (Mudur ve Memur)
    // tanımlayın. Her sınıfın "maasHesapla" metodu olsun

    val mudur = Mudur(50000.0, 20000.0)
    val memur = Memur(30000.0)
    println("Mudurun maaşı : " + mudur.maasHesapla())
    println("Memurun maaşı : " + memur.maasHesapla())
}

interface Employee{
    fun maasHesapla(): Double
}

class Memur(val maas: Double): Employee{
    override fun maasHesapla(): Double {
        return maas
    }
}

class Mudur(val aylikMaas: Double, val prim: Double): Employee{
    override fun maasHesapla(): Double {
        return aylikMaas + prim
    }
}

