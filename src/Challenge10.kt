import javax.swing.JOptionPane

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
    println("THREE IN A ROW")

    /*var test = JOptionPane.showInputDialog("Introduce un caracter");
    println(test)*/

    var matriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )

    for (i in (0 until 3)){

        for (j in (0 until 3)){
            print("${matriz[i][j]},")
        }

        println()
    }
}

