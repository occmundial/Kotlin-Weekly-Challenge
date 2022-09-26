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
    println(factorial(6U))
}

fun factorial(number: UInt): UInt {
    return if (number > 0U) {
        number * factorial(number -1U)
    } else {
        1U
    }
}