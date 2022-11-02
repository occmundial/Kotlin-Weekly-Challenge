import kotlin.random.Random

/*
* Challenge #11
* Trick or Treat
* Date: 31/10/2022
* Difficulty: Medium
*
* We must create a program to which we indicate if we want to perform "Trick or Treat"
* and a list (array) of people with the following properties:
*
* - Name of the girl or boy
* - Age
* - Height in centimeters
*
* If people have asked for a cheat, the program will return scares (randomly)
* following these criteria:
*
* - One scare for every 2 letters of the name per person
* - Two scares for each age that is an even number
* - Three frights for every 100 cm of height among all people
* - Scares: 🎃 👻 💀 🕷 🕸 🦇
*
* If people have asked for treatment, the program will return sweets (random)
* following these criteria:
*
* - One candy for each letter of name
* - One sweet for every 3 years up to a maximum of 10 years per person
* - Two sweets for every 50 cm of height up to a maximum of 150 cm per person
* - Sweets: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
*/

val scaresArray = arrayOf("🎃", "👻", "💀", "🕷", "🕸", "🦇")
val sweetsArray = arrayOf("🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩",)

enum class Choose { Trick, Treat }

data class Children(val name: String, val age: Int, val height: Int, val choose: Choose)

val people = arrayOf(
    Children("Manuel", 10, 160, Choose.Trick),
    Children("Josefina", 12, 110, Choose.Treat),
    Children("Alma", 5, 50, Choose.Trick),
    Children("Pedro", 7, 120, Choose.Treat)
)

fun main() {
    people.trickOrTreat()
}

fun Array<Children>.trickOrTreat() {
    forEach { children ->
        when(children.choose) {
            Choose.Trick -> println(children.trick())
            Choose.Treat -> println(children.treat())
        }
    }
}

fun Children.trick(): String {
    val scaresFromName: Int = (name.count() / 2)
    val scaresFromAge = if (age % 2 == 0) 2 else 0
    val scaresFromHeight: Int = (height / 100) * 3
    val total = scaresFromName + scaresFromAge + scaresFromHeight
    var scares = ""
    for (i in 0 until total) {
        scares += scaresArray[Random.nextInt(0, scaresArray.size)]
    }
    return scares
}

fun Children.treat(): String {
    val sweetsFromName: Int = name.length
    val sweetsFromAge: Int = if (age > 10) 3 else age / 3
    val sweetsFromHeight: Int = if (height > 150) 6 else (height / 50) * 2
    val total = sweetsFromHeight + sweetsFromAge + sweetsFromName
    var sweets = ""
    for (i in 0 until total) {
        sweets += sweetsArray[Random.nextInt(0, sweetsArray.size)]
    }
    return sweets
}