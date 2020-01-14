package controlFlow

class Animal(val name: String)

class Zoo (val animals: List<Animal>)
{
    operator fun iterator(): Iterator<Animal>
    {
        return animals.iterator()
    }
}

fun main(){
    val zoo= Zoo(listOf(Animal("Zebra"), Animal("lion")))

    for(animal in zoo){
        println("Watch out. It's a $animal.name")
    }
}

