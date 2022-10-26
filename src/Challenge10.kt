import kotlin.math.abs

/*
* Challenge #10
* THREE IN A ROW
* Date: 24/10/2022
* Difficulty: Hard
*
* Create a function that parses a 3x3 matrix made up of "X" and "O" and returns the following:
* - "X" if they have won the "X"
* - "O" if they have won the "O"
* - "Draw" if there was a draw
* - "Null" if the proportion of "X", of "O", or of the matrix is not correct. Or if both have won.
* Note: Matrix may not be fully covered. It could be represented with an empty "", for example.
*/

val game1: Array<Array<String>> = arrayOf(
    arrayOf("X", "X", "X"),
    arrayOf("X", "O", "O"),
    arrayOf("", "O", "O")
)
val game2: Array<Array<String>> = arrayOf(
    arrayOf("O", "X", "O"),
    arrayOf("X", "O", ""),
    arrayOf("O", "", "X")
)
val game3: Array<Array<String>> = arrayOf(
    arrayOf("X", "X", "X"),
    arrayOf("X", "O", "O"),
    arrayOf("", "O", "X")
)
fun main() {
    println(game1.whoWins())
    println(game2.whoWins())
    println(game3.whoWins())
}

fun Array<Array<String>>.whoWins(): String {
    var numOfX = 0
    var numOfO = 0
    var wins = "Draw"
    var numOfWins = 0
    val vertical: MutableList<String> = arrayListOf()
    val crossLine: MutableList<String> = arrayListOf()
    val secondCrossLine: MutableList<String> = arrayListOf()
    this.forEachIndexed { index, file ->
        for (i in 0 until this.size) {
            if (file[i] == "X") numOfX++ else if (file[i] == "O") numOfO++
            vertical.add(this[i][index])
            crossLine.add(this[i][i])
            secondCrossLine.add(this[this.lastIndex - i][i])
        }
        if (file.contentToString() == X_WIN || vertical.toString() == X_WIN || crossLine.toString() == X_WIN || secondCrossLine.toString() == X_WIN) {
            wins = "X"
            numOfWins++
        }
        if (file.contentToString() == O_WIN || vertical.toString() == O_WIN || crossLine.toString() == O_WIN || secondCrossLine.toString() == O_WIN) {
            wins = "O"
            numOfWins++
        }
        vertical.clear()
    }
    if (numOfWins > 1 || abs(numOfO-numOfX) > 1) return "Null"
    return wins
}

const val X_WIN = "[X, X, X]"
const val O_WIN = "[O, O, O]"