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
* If people have asked for a trick, the program will return scares (randomly)
* following these criteria:
*
* - One scare for every 2 letters of the name per person
* - Two scares for each age that is an even number
* - Three scares for every 100 cm of height among all people
* - Scares: 🎃 👻 💀 🕷 🕸 🦇
*
* If people have asked for treat, the program will return sweets (random)
* following these criteria:
*
* - One candy for each letter of name
* - One candy for every 3 years up to a maximum of 10 years per person
* - Two candies for every 50 cm of height up to a maximum of 150 cm per person
* - Sweets: 🍰 🍬 🍡 🍭 🍪 🍫 🧁 🍩
*/
fun main() {

    val kids = arrayOf(
        Kid(name = "Enrique", age = 11, height = 151),
        Kid(name = "Maria Jose", age = 10, height = 150),
        Kid(name = "Annabel", age = 5, height = 98),
        Kid(name = "Ana", age = 1, height = 49),
        Kid(name = "Raul de Jesus", age = 15, height = 168),
        Kid(name = "Juan", age = 3, height = 50),
        Kid(name = "Manuel", age = 3, height = 50)
    )

    println(kids.trickOrTread(Halloween.TRICK))
    println(kids.trickOrTread(Halloween.TREAT))
}

data class Kid(val name: String, val age: Int, val height: Int)

enum class Halloween {
    TRICK, TREAT
}

fun Array<Kid>.trickOrTread(halloween: Halloween): String {
    val scares = arrayListOf("🎃", "👻", "💀", "🕷", "🕸", "🦇")
    val sweets = arrayListOf("🍰", "🍬", "🍡", "🍭", "🍪", "🍫", "🧁", "🍩")

    var presents = 0
    var rewards = ""

    when (halloween) {
        Halloween.TRICK -> {
            var heights = 0
            this.forEach { kid ->
                // One scare for every 2 letters of the name per person
                presents += (kid.name.replace(" ", "").length / 2)
                // Two scares for each age that is an even number
                presents += if (kid.age % 2 == 0) 2 else 0
                // sum of heights
                heights += kid.height
            }
            // Three scares for every 100 cm of height among all people
            presents += (heights / 100) * 3
            for (i in 1..presents) {
                rewards += scares.random()
            }
        }

        Halloween.TREAT -> {
            this.forEach { kid ->
                // One candy for each letter of name
                presents += kid.name.replace(" ", "").length
                // One candy for every 3 years up to a maximum of 10 years per person
                presents += if (kid.age > 10) 3 else kid.age / 3
                // Two candies for every 50 cm of height up to a maximum of 150 cm per person
                presents += if (kid.height > 150) 6 else (kid.height / 50) * 2
            }
            for (i in 1..presents) {
                rewards += sweets.random()
            }
        }
    }
    return rewards
}