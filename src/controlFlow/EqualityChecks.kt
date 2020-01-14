package controlFlow

fun main(){
    val authors= setOf("Shakespeare", "Hemingway", "Tiwan")
    val writers= setOf("Tiwan", "Shakespeare", "Hemingway")

    println(authors== writers)
    println(authors === writers)
}
