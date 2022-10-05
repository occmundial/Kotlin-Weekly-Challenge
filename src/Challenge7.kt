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

lateinit var effectiveness: Map<String, Float>
val types = arrayOf("Water", "Fire", "Electric", "Grass")
fun main() {
    println(superBattle("Fire", "Fire", 80, 20))
}

fun superBattle(typeAttack: String, typeDefending: String, attack: Int, defense: Int): Float? {
    if (!types.contains(typeAttack) || !types.contains(typeDefending)) {
        print("No existe el tipo")
        return null
    }
    if (attack !in 1..100 || defense !in 1..100) {
        print("Ingresa un valor entre 1 y 100")
        return null
    }
    effectiveness = mapOf(
        "WaterFire" to 2f,
        "WaterElectric" to 0.5f,
        "FireGrass" to 2f,
        "FireWater" to 0.5f,
        "GrassWater" to 2f,
        "GrassFire" to 0.5f,
        "ElectricWater" to 2f,
        "ElectricGrass" to 0.5f,
    )
    val effect: Float = effectiveness[typeAttack + typeDefending] ?: 1f
    return 50 * (attack / defense) * effect
}