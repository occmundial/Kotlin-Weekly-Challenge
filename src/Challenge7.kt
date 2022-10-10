/*
* Challenge #7
*
* Date: 05/10/2022
* Difficulty: Medium
*
* Create a program that calculates the damage of an attack during a Pokémon battle.
* - The formula will be as follows: damage = 50 * (attack / defense) * effectiveness
* - Effectiveness: x2 (super effective), x1 (neutral), x0.5 (not very effective)
* - There are only 4 types of Pokémon: Water, Fire, Grass and Electric (look for their effectiveness)
* - The program receives the following parameters:
* - Type of the attacking Pokémon.
* - Type of the defending Pokémon.
* - Attack: Between 1 and 100.
* - Defense: Between 1 and 100.
*/

fun main() {
    println(battle(PokemonType.WATER, PokemonType.FIRE, 50, 30))
    println(battle(PokemonType.WATER, PokemonType.FIRE, 101, -10))
    println(battle(PokemonType.FIRE, PokemonType.WATER, 50, 30))
    println(battle(PokemonType.FIRE, PokemonType.FIRE, 50, 30))
    println(battle(PokemonType.GRASS, PokemonType.ELECTRIC, 50, 30))
}

enum class PokemonType(name: String) {
    WATER("Agua"),
    FIRE("Fuego"),
    GRASS("Hierva"),
    ELECTRIC("Eléctrico")
}

private data class PokemonChart(val effective: PokemonType, val notEffective: PokemonType)

private fun battle(attacker: PokemonType, defender: PokemonType, attack: Int, defense: Int): Double? {
    if (attack < 0 || attack > 100) {
        println("El ataque contiene un valor incorrecto")
        return null
    }

    if (defense < 0 || defense > 100) {
        println("La defensa contiene un valor incorrecto")
        return null
    }

    val chart = mapOf(
        PokemonType.WATER to PokemonChart(PokemonType.FIRE, PokemonType.GRASS),
        PokemonType.FIRE to PokemonChart(PokemonType.GRASS, PokemonType.WATER),
        PokemonType.GRASS to PokemonChart(PokemonType.WATER, PokemonType.FIRE),
        PokemonType.ELECTRIC to PokemonChart(PokemonType.WATER, PokemonType.GRASS)
    )

    val effectivity = if (chart[attacker]!!.notEffective == defender){
        println("No es muy efectivo")
        0.5
    } else if (chart[attacker]!!.effective == defender) {
        println("Es muy efectivo")
        2.0
    } else {
        println("Es neutro")
        1.0
    }

    return 50 * attack.toDouble() / defense.toDouble() * effectivity
}
