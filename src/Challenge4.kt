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

    println("** 1 **")

    for(index in 1..100){
        println(index)
    }

    println("** 2 **")

    var whileIndex = 1

    while (whileIndex <= 100) {
        println(whileIndex)
        whileIndex += 1
    }

    println("** 3 **")

    whileIndex = 1
    do {
        println(whileIndex)
        whileIndex++
    } while (whileIndex <= 100)

    println("** 4 **")

    fun print100(index: Int) {
        if (index <= 100){
            println(index)
            print100(index + 1)
        }
    }

    print100(1)

    println("** 4 **")

    (1..100).forEach { index ->
        println(index)
    }

    println("** 6 **")

    println((1..100).filter {
        true
    })

    println("** 7 **")

    println((1..100).map { it })

    println("** 8 **")

    repeat(100) {
        println(it + 1)
    }

}