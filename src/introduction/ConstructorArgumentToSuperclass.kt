package introduction

open class Lion(val name: String, val origin: String){
    fun SayHello(){
        println("$name, the lion from $origin says: GRRRRHHH")
    }
}

class Asiatic(name: String): Lion(name= name, origin= "India")

fun main(){
    val lion: Lion= Asiatic("Rufo")
    lion.SayHello()
}