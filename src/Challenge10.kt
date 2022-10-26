import kotlin.math.absoluteValue

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
fun main() {

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.X, TicTacToeValue.O, TicTacToeValue.O),
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.X),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.O)
            )
        )
    )

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.X, TicTacToeValue.O, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.EMPTY, TicTacToeValue.X, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.EMPTY, TicTacToeValue.O, TicTacToeValue.X)
            )
        )
    )

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.O, TicTacToeValue.EMPTY, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.EMPTY)
            )
        )
    )

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.EMPTY),
                arrayOf(TicTacToeValue.O, TicTacToeValue.X, TicTacToeValue.EMPTY)
            )
        )
    )

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.X, TicTacToeValue.O, TicTacToeValue.X),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.O),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.X)
            )
        )
    )

    println(
        checkTicTacToe(
            arrayOf(
                arrayOf(TicTacToeValue.X, TicTacToeValue.O, TicTacToeValue.X),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.O),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.X),
                arrayOf(TicTacToeValue.X, TicTacToeValue.X, TicTacToeValue.X)
            )
        )
    )

}

private enum class TicTacToeValue {
    X, O, EMPTY
}

private enum class TicTacToeResult() {
    X,
    O,
    DRAW,
    NULL
}

private fun checkTicTacToe(board: Array<Array<TicTacToeValue>>): TicTacToeResult {

    // Null

    if (board.count() != 3) {
        return TicTacToeResult.NULL
    }

    var xCount = 0
    var oCount = 0

    var flatBoard: Array<TicTacToeValue> = emptyArray()
    for (row in board) {
        flatBoard += row

        if (row.count() != 3) {
            return TicTacToeResult.NULL
        }

        for (col in row) {
            if (col == TicTacToeValue.X) {
                xCount += 1
            } else if (col == TicTacToeValue.O) {
                oCount += 1
            }
        }
    }

    if ((xCount - oCount).absoluteValue > 1) {
        return TicTacToeResult.NULL
    }

    // Win or Draw

    val winCombinations = arrayOf(
        arrayOf(0, 1, 2), arrayOf(3, 4, 5), arrayOf(6, 7, 8), arrayOf(0, 3, 6),
        arrayOf(1, 4, 7), arrayOf(2, 5, 8), arrayOf(0, 4, 8), arrayOf(2, 4, 6)
    )

    return getResult(winCombinations, flatBoard)
}

private fun getResult(winCombinations: Array<Array<Int>>, flatBoard: Array<TicTacToeValue>): TicTacToeResult {
    var result = TicTacToeResult.DRAW

    for (winCombination in winCombinations) {

        if (flatBoard[winCombination[0]] != TicTacToeValue.EMPTY
            && flatBoard[winCombination[0]] == flatBoard[winCombination[1]]
            && flatBoard[winCombination[0]] == flatBoard[winCombination[2]]
        ) {

            val winner = flatBoard[winCombination[0]]

            if (result != TicTacToeResult.DRAW && (
                        if (result == TicTacToeResult.O) TicTacToeValue.O else TicTacToeValue.X) != winner
            ) {
                return TicTacToeResult.NULL
            }

            result = if (winner == TicTacToeValue.X) TicTacToeResult.X else TicTacToeResult.O
        }
    }
    return result
}

