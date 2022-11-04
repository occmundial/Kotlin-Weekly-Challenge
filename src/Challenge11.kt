
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
fun main() {
    println("Hello Halloween 🎃 👻 💀 🕷 🕸 🦇")

    val personas = ArrayList<Persona>()
    personas.add(Persona("Andrea", 3, 60))
    personas.add(Persona("Manuel", 7, 105))
    personas.add(Persona("Jesus", 5, 150))
    personas.add(Persona("Diana", 12, 100))
    personas.add(Persona("Elizabeth", 10, 70))
    personas.add(Persona("Gerardo", 8, 90))

    var trickOrTreat: Boolean = false
    val volado = TrickOrTreat()

    if (volado >= 50){
        trickOrTreat = true
    }else{
        trickOrTreat = false
    }

    
    println("El elemento en la posicion tres es: " + personas[2])
    println("Todos los elementos son:")

    for(persona in personas){
        println(persona.name.toCharArray().size)
    }
}

fun Sweets(): Int{
    return (0..7).random()
}

fun Scares(): Int{
    return (0..5).random()
}

fun TrickOrTreat(): Int {
    return (1..100).random()
}

data class Persona(
    var name: String = "",
    var edad: Int = 0,
    var estatura: Int = 0
)