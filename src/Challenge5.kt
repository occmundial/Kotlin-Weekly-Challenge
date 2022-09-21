/*
* Challenge #5
*
* Date: 21/09/2022
* Difficulty: Easy
*
* Write a function that displays on the console (with a print) the numbers from 1 to 1000 (both included and with a line break between each print),
* substituting the following:
* - Multiples of 3 for the word "fizz".
* - Multiples of 5 for the word "buzz".
* - Multiples of 3 and 5 at the same time for the word "fizzbuzz".
*
*/
fun main() {
    (1..1_000).forEach { index ->
        val divisibleByThree = index % 3 == 0
        val divisibleByFive = index % 5 == 0
        var num = index.toString()
        if (divisibleByThree && divisibleByFive) {
            num = "fizzbuzz"
        } else if (divisibleByThree) {
            num = "fizz"
        } else if (divisibleByFive){
            num = "buzz"
        }
        println(num)
    }
}