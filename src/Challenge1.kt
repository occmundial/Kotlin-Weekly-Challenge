import kotlin.random.Random

/*
* Challenge #1
*
* Date: 08/08/2022
* Difficulty: Easy
* Write a function that receives an array of int and returns the second-highest value
* - Check Execution time complexity
* - Check Cognitive complexity
*/

const val RAND = 100_000

fun main(){
    // [1, 6, 8, 4, 9, 12, 30, 15, 2, 4, 7, 3, 10, 4, 7, 11, 14]
    val array = arrayOf(1, 6, 8, 4, 9, 12, 30, 15, 2, 4, 7, 3, 10, 4, 7, 11, 14)

    val mArray = mutableListOf<Int>()
    repeat((0..RAND).count()) {
        mArray.add(Random.nextInt(0, RAND))
    }


    measureTimeMillis { println("returnsTSHV1: ${returnsTSHV1(mArray.toTypedArray())}") }

    measureTimeMillis { println("returnsTSHV2: ${returnsTSHV2(mArray.toTypedArray())}") }

    measureTimeMillis { println("highest: ${highest(mArray)}") }
}

/*
* returnsTSHV1: 99997
* time: 68 millis
* returnsTSHV2: 99997
* time: 46 millis
* highest: 99997
* time: 8 millis
* */

inline fun measureTimeMillis(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("time: ${System.currentTimeMillis() - start} millis")
}

/**
 * "Remove the highest number from the list, then return the highest number from the list."
 *
 * The function takes a list of integers and returns the second-highest number
 *
 * @param array an array of integers
 * @return The second-highest number in the array.
 */
fun highest(array: MutableList<Int>): Int {
    array.remove(array.max())
    return array.max()
}

/**
 * Returns the second-highest value in an array of integers
 *
 * @param arrayList Array<Int>
 * @return The second-highest value in the array
 */
fun returnsTSHV1(arrayList: Array<Int>): Int {
    return arrayList.sortedDescending()[1]
}

// 24 millis
/**
 * Returns the second-highest value in an array of integers
 *
 * @param arrayList Array<Int> - This is the array that we're going to be using.
 * @return The second-highest value in the array
 */
fun returnsTSHV2(arrayList: Array<Int>): Int {
    val secondNumber = arrayList.size
    return arrayList.sorted()[secondNumber - 2]
}