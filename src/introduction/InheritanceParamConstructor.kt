package introduction

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: GRRHH!")
    }
}

class SiberianTiger: Tiger("Siberia")

fun main(){
    val tiger: Tiger= SiberianTiger()
    tiger.sayHello()
}