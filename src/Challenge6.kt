/*
* Challenge #6
*
* Date: 26/09/2022
* Difficulty: Easy
*
* Write a function that calculates and returns the factorial of a given number recursively.
*
*/
fun main() {
    println(factorial(0) ?: run { "No tiene factorial" })
    println(factorial(-1) ?: run { "No tiene factorial" })
}

private fun factorial(n: Int): Int? {
    return if (n < 0) null else if (n <= 1) 1 else n * (factorial(n - 1)!!)
}