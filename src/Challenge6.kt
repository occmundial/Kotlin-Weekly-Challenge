/*
* Challenge #6
*
* Date: 26/09/2022
* Difficulty: Easy
*
* Write a function that calculates and returns the factorial of a given number recursively.
*
*/


fun main(){

    val number = 5.0

    if (number.isFinite()){
        println("Este numero decimal no puede tener factorial")
    }else if (number <= 0){
        println("Este numero no puede tener factorial")
    }else{
        println("El factorial de $number es: ${Factorial(number.toInt())}")
    }

}
fun Factorial(number: Int) : Int {

    if (number <= 1){
        return 1
    }

    return number * Factorial(number - 1)
}