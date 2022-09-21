/*
* Challenge #5
*
* Date: 05/09/2022
* Difficulty: Easy
*
* Write a function that displays on the console (with a print) the numbers from 1 to 1000 (both included and with a line break between each print), substituting the following:
* - Multiples of 3 for the word "fizz".
* - Multiples of 5 for the word "buzz".
* - Multiples of 3 and 5 at the same time for the word "fizzbuzz".
*
*/

fun main() {
    (1..1000).forEach {
        var num = it.toString()
        if (it % 3 == 0) {
            num = "fizz"
        }
        if (it % 5 == 0) {
            num = if (num == "fizz") "fizzbuzz" else "buzz"
        }
        println(num)
    }
}