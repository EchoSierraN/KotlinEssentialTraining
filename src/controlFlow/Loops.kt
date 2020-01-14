package controlFlow

fun main()
{
    val cakes = listOf("Carrot", "Cheese", "Chocolate")
    val yay= "Yummy "

    for(cake in cakes){
        println("${yay.repeat(2)+ "${yay.trim()}"}. It's a $cake cake.")
    }
}