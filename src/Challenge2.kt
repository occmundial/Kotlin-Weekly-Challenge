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

lateinit var naturalDictionary: Map<String, String>
var morseDictionary = mutableMapOf<String, String>()

fun main() {
    createDictionaries()
    val naturalText = "Hola Checo"
    val morseText = ".... --- .-.. .-  ---- . -.-. ---"
    println(decoder(naturalText))
    println(decoder(morseText))
}

private fun createDictionaries() {
    naturalDictionary = mapOf(
        "A" to ".-", "N" to "-.", "0" to "-----",
        "B" to "-...", "Ñ" to "--.--", "1" to ".----",
        "C" to "-.-.", "O" to "---", "2" to "..---",
        "CH" to "----", "P" to ".--.", "3" to "...--",
        "D" to "-..", "Q" to "--.-", "4" to "....-",
        "E" to ".", "R" to ".-.", "5" to ".....",
        "F" to "..-.", "S" to "...", "6" to "-....",
        "G" to "--.", "T" to "-", "7" to "--...",
        "H" to "....", "U" to "..-", "8" to "---..",
        "I" to "..", "V" to "...-", "9" to "----.",
        "J" to ".---", "W" to ".--", "." to ".-.-.-",
        "K" to "-.-", "X" to "-..-", "," to "--..--",
        "L" to ".-..", "Y" to "-.--", "?" to "..--..",
        "M" to "--", "Z" to "--..", "\"" to ".-..-.", "/" to "-..-."
    )
    naturalDictionary.forEach {
        morseDictionary[it.value] = it.key
    }
}

private fun decoder(input: String): String {
    var output = ""

    if (input.contains(Regex("[a-zA-Z0-9]"))) {
        // texto
        output = getMorse(input)
    } else if (input.contains(".") || input.contains("-")) {
        // morse
        output = getNatural(input)
    }
    return output
}

private fun getMorse(input: String): String {
    var index = 0
    var ch = false

    var output = ""
    input.uppercase().forEach { character ->
        if (!ch && character.toString() != " ") {
            val next = index + 1
            if (character.toString() == "C" && next < input.length && input.uppercase()[next].toString() == "H") {
                output += naturalDictionary["CH"]
                ch = true
            } else {
                output += naturalDictionary[character.toString()]
            }
            output += " "
        } else {
            if (!ch) {
                output += " "
            }
            ch = false
        }
        index++
    }
    return output
}

private fun getNatural(input: String): String {
    var output = ""
    input.split("  ").forEach { word ->
        word.split(" ").forEach { symbol ->
            if (symbol.isNotEmpty()) {
                output += morseDictionary[symbol]
            }
        }
        output += " "
    }
    return output
}
