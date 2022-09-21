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

fun main(){

    for(index in 1..1000){

        if (((index % 3) == 0) && ((index % 5) == 0)){
            println("fizzbuzz")
        }else if ((index % 3) == 0){
            println("fizz")
        }else if ((index % 5) == 0){
            println("buzz")
        } else{
            println(index)
        }
    }
}