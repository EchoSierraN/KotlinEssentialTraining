package controlFlow

fun main(){
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("Hello")
}

fun cases(obj: Any){
    when (obj){
        1 -> println("One")
        "Hello" -> println("Greetings!")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass