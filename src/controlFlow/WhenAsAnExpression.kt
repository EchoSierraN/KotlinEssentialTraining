package controlFlow

fun main(){
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any{
    val result= when(obj){
        1-> "One"
        "Hello" -> 1
        is Long -> "False"
        else -> 42
    }

    return result;
}