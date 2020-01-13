package introduction

fun main() {
    fun printAll(vararg messages: String) {
        for (m in messages) print(m)
    }

    printAll("Hello", "Hallo", "Salute", "Hola", "你好")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "Hallo", "Salute", "Hola", "你好", prefix= "Greeting: ")

    fun log(vararg entries: String){
        printAll(*entries)
    }
}

