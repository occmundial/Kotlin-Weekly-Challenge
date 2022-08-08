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
    val array = arrayOf(1, 6, 8, 4, 9, 12, 30, 15, 2, 4, 7, 3, 10, 4, 7, 11, 14)
    //measureTimeMillis { print("Hello world!") }
    measureTimeMillis { println("the second highest value is: ${returnsTSHV(array)}") }
}

inline fun measureTimeMillis(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("time: ${System.currentTimeMillis() - start} millis")
}

/* 24 millis
fun returnsTSHV(arrayList: Array<Int>): Int {
    return arrayList.sortedDescending()[1]
}*/

/* 24 millis
fun returnsTSHV(arrayList: Array<Int>): Int {
    val secondNumber = arrayList.sorted().size
    return arrayList.sorted()[secondNumber - 2]
}*/

//
fun returnsTSHV(arrayList: Array<Int>): Int {
    val secondNumber = arrayList.sorted().size
    return arrayList.sorted()[secondNumber - 2]
}