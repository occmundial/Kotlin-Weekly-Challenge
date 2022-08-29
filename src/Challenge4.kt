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
    //count1()
    //count2(1)
    //count3()
    count4()
}

fun count1() {
    var number = 1
    while (number <= 100) {
        println(number)
        number += 1
        Thread.sleep(200)
    }
}

fun count2(number: Int) {
    if (number <= 100) {
        println(number)
        Thread.sleep(200)
        count2(number + 1)
    }
}

fun count3() {
    for (number in 1..100) {
        println(number)
        Thread.sleep(200)
    }
}

fun count4() {
    var number = 1
    do {
        println(number)
        number += 1
        Thread.sleep(200)
    } while (number <= 100)
}
