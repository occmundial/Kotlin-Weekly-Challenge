/*
* Challenge #4
*
* Date: 29/08/2022
* Difficulty: Easy
*
* I want to count from 1 to 100 one by one (printing each one). How are you able to do it? Create the code for each of them.
*
*/
fun main() {
    //contFor()
    //contWhile()
    contDoWhile()
}

private fun contFor(){
    for (elemento in 1..100){
        printElement(elemento)
    }
}

private fun contWhile(){
    var count = 0

    while (count <= 100){
        printElement(count)
        count++
    }
}

private fun contDoWhile(){
    var count = 0

    do{
        printElement(count)
        count++
    }while (count <= 100)
}

private fun printElement(number: Int){
    println("El numero actual es: $number")
}