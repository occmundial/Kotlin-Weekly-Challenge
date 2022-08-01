
/*
* Challenge #0
* ANAGRAM
* Date: 01/08/2022
* Difficulty: Easy
*
* Roma Amor = true
* roma amor = true
* vacio enfermo = false
* amor amor = false
*
*
* Write a function that receives two words (String) and returns true or false (Boolean) depending on whether or not they are anagrams.
* - An Anagram consists of forming a word by rearranging ALL the letters of another initial word.
* - It is NOT necessary to check that both words exist.
* - Two exactly the same words are not an anagram.
*/

fun main(){
    println(isAnagram("Valora","alvaro"))
}

fun isAnagram(text: String, text2: String): Boolean {
    if (text.lowercase() == text2.lowercase()) return false
    return text.lowercase().toCharArray().sortedArray().contentEquals(text2.lowercase().toCharArray().sortedArray())
}
