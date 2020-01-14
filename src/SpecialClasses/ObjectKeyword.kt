package SpecialClasses

import java.util.Random

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun main() {
    rentPrice(10, 2, 1)                                                         //5
}

//
//class LuckDispatcher {
//    fun getNumber() {
//        var objRandom = Random()
//        println(objRandom.nextInt(90))
//    }
//}
//
//fun main() {
//    val d1 = LuckDispatcher()
//    val d2 = LuckDispatcher()
//
//    d1.getNumber()
//    d2.getNumber()
//}
//
