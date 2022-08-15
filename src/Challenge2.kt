/*
* Challenge #2
*
* Date: 15/08/2022
* Difficulty: Medium
* Create a function that translate from natural text to Morse code and vice versa.
* - Must be automatically detect what type it is and perform the conversion.
* - In Morse, dash "—", dot ".", a space " " between letters or symbols, and two spaces between words " " are supported.
* - The supported morse alphabet will be the one shown in https://es.wikipedia.org/wiki/Código_morse.
*/

val letterNormal = arrayOf("A", "B", "C", "CH", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", "?", "\"", "/")
val letterMorse = arrayOf(".-", "-...", "-.-.", "----", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--..", ".-..-.", "-..-.")

fun main() {
    translateCode("Hello Kotlin")
}

fun translateCode(words: String): String{

    val wordsUpperCase = words.uppercase()
    val arrayUpperCase = wordsUpperCase.toCharArray()

    var arrayLetterCode<String> = null
    for (letter in arrayUpperCase){

        val index = letterNormal.indexOf(letter.toString())


        println(index)
    }

    return ""
}

