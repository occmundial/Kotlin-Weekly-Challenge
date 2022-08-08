/*
* Challenge #1
*
* Date: 08/08/2022
* Difficulty: Medium
* Write a function that receives an array of int and returns the second-highest value
* - Check Execution time complexity
* - Check Cognitive complexity
*/

fun main(){
    val arrayX = arrayOf(1, 6, 8, 4, 9, 12, 30, 15, 2, 4, 7, 3, 10, 4, 7, 11, 14)
    measureTimeMillis {
        //println(arrayX.sortedArray()[arrayX.lastIndex -1])
        println(arrayX.sortedArrayDescending()[1])
    }
}

inline fun measureTimeMillis(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("time: ${System.currentTimeMillis() - start} millis")
}