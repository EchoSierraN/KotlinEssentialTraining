package controlFlow

fun main(){
    for(i in 0..3){
        print(i)
    }

    print(" ")

    for (i in 2..8 step 2){
        print(i)
    }

    print(" ")


    for (i in 3 downTo 0)
    {
        print(i)
    }

    print(" ")

    for(i in 'a'..'z')
    {
        print(i)
    }

    val x= 2

    if(x in 1..10){
        print(x)
    }

    if(x !in 5..10){
        print(x)
    }
}