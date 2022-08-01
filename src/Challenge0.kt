
/*
* Challenge #0
*
* Date: 01/08/2022
* Difficulty:
*
*/

fun main(){
    print("Las palabras son: " + anagram("anita", "tania"))

}

fun anagram(wordOne: String, wordTwo: String): Boolean{

    val validation: Boolean = if (wordOne == wordTwo){
        false
    }else {
        if (wordOne.length == wordTwo.length){
            val first: CharArray = toCharacterArray(wordOne)
            println("First Word: $first")
            val second: CharArray = toCharacterArray(wordTwo)
            println("Second Word: $second")
            println("Result: ${first.toTypedArray() contentEquals second.toTypedArray()}")
            first.toTypedArray() contentEquals second.toTypedArray()
        }else{
            false
        }

    }

    return validation
}

fun toCharacterArray(str: String): CharArray {
    return str.toCharArray()
}