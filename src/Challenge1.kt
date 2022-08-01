/*
* Challenge #1
*
* Date: 08/08/2022
* Difficulty: Medium
*
*/

fun main(){
    measureTimeMillis { print("Hello world!") }
}

inline fun measureTimeMillis(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println(System.currentTimeMillis() - start)
}