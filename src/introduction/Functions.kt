package introduction

fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("${prefix} $message")
}

fun sum(x: Int, y: Int): Int{
    return x+y
}

fun multiply(x: Int, y: Int): Int = x*y

fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix= "Log", message = "Message")
    println(sum(1,2))
}