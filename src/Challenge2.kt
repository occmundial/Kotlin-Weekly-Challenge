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

fun main() {
    println(translate("hello world."))
    println(translate("···· · ·—·· ·—·· ———  ·—— ——— ·—· ·—·· —·· ·—·—·— "))
}

fun translate(text: String) {
    val isNatural = text.contains(Regex("[a-zA-Z]"))
    if (isNatural) {
        println(getMorse(text))
    } else {
        println(getNatural(text))
    }
}

fun getNatural(text: String): String {
    return text
        .replace("·—·—·— ","$")
        .replace("——··—— ",",")
        .replace("··——·· ","\\?")
        .replace("·—··—· ","\"")
        .replace("——·—— ","Ñ")
        .replace("————— ","0")
        .replace("·———— ","1")
        .replace("··——— ","2")
        .replace("···—— ","3")
        .replace("····— ","4")
        .replace("····· ","5")
        .replace("—···· ","6")
        .replace("——··· ","7")
        .replace("———·· ","8")
        .replace("————· ","9")
        .replace("—··—· ","/")
        .replace("···— ","V")
        .replace("—··— ","X")
        .replace("—·—— ","Y")
        .replace("——·· ","Z")
        .replace("·——· ","P")
        .replace("——·— ","Q")
        .replace("·—·· ","L")
        .replace("·——— ","J")
        .replace("···· ","H")
        .replace("··—· ","F")
        .replace("———— ","CH")
        .replace("—·—· ","C")
        .replace("—··· ","B")
        .replace("—·· ","D")
        .replace("——— ","O")
        .replace("·—· ","R")
        .replace("··· ","S")
        .replace("··— ","U")
        .replace("·—— ","W")
        .replace("—·— ","K")
        .replace("——· ","G")
        .replace("·· ","I")
        .replace("—— ","M")
        .replace("—· ","N")
        .replace("·— ","A")
        .replace("· ","E")
        .replace("— ","T")
        .replace("$",".")

}

fun getMorse(text: String): String {
    return text
        .replace(Regex("[.]"),"·—·—·— ")
        .replace(Regex("a"),"·— ")
        .replace(Regex("b"),"—··· ")
        .replace(Regex("ch"),"———— ")
        .replace(Regex("c"),"—·—· ")
        .replace(Regex("d"),"—·· ")
        .replace(Regex("e"),"· ")
        .replace(Regex("f"),"··—· ")
        .replace(Regex("g"),"——· ")
        .replace(Regex("h"),"···· ")
        .replace(Regex("i"),"·· ")
        .replace(Regex("j"),"·——— ")
        .replace(Regex("k"),"—·— ")
        .replace(Regex("l"),"·—·· ")
        .replace(Regex("m"),"—— ")
        .replace(Regex("n"),"—· ")
        .replace(Regex("ñ"),"——·—— ")
        .replace(Regex("o"),"——— ")
        .replace(Regex("p"),"·——· ")
        .replace(Regex("q"),"——·— ")
        .replace(Regex("r"),"·—· ")
        .replace(Regex("s"),"··· ")
        .replace(Regex("t"),"— ")
        .replace(Regex("u"),"··— ")
        .replace(Regex("v"),"···— ")
        .replace(Regex("w"),"·—— ")
        .replace(Regex("x"),"—··— ")
        .replace(Regex("y"),"—·—— ")
        .replace(Regex("z"),"——·· ")
        .replace(Regex("0"),"————— ")
        .replace(Regex("1"),"·———— ")
        .replace(Regex("2"),"··——— ")
        .replace(Regex("3"),"···—— ")
        .replace(Regex("4"),"····— ")
        .replace(Regex("5"),"····· ")
        .replace(Regex("6"),"—···· ")
        .replace(Regex("7"),"——··· ")
        .replace(Regex("8"),"———·· ")
        .replace(Regex("9"),"————· ")
        .replace(Regex(","),"——··—— ")
        .replace(Regex("\\?"),"··——·· ")
        .replace(Regex("\""),"·—··—· ")
        .replace(Regex("/"),"—··—· ")
}