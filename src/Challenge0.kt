
/*
* Challenge #0
*
* Date: 01/08/2022
* Difficulty:
*
*/

fun main() {
    println(esAnagrama("Valora", "alvaro"))
}

fun esAnagrama(palabra1: String, palabra2: String): Boolean {
    if (palabra1.lowercase() == palabra2.lowercase() || palabra1.length != palabra2.length) return false
    var anagrama = true
    for (letra in palabra1) {
        anagrama = palabra2.contains(letra.lowercase())
        if(!anagrama || palabra1.lowercase().split(letra).size != palabra2.lowercase().split(letra).size) return false
    }
    for (letra in palabra2) {
        anagrama = palabra1.lowercase().contains(letra.lowercase())
    }
    return anagrama
}