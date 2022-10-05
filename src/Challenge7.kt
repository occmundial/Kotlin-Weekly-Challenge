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

fun main(){
    println(startBattle(WATER, 10, 100, FIRE, 100, 50))
}

fun startBattle(typePokemon1: Int, attack1: Int, defense1: Int, typePokemon2: Int, attack2: Int, defense2: Int): String{

    var winner = ""

    if (getDamage(attack1, defense1, getEffectiveness(typePokemon1)) < getDamage(attack2, defense2, getEffectiveness(typePokemon2))){
        winner = "fue un empate"
    }else if (getDamage(attack1, defense1, getEffectiveness(typePokemon1)) < getDamage(attack2, defense2, getEffectiveness(typePokemon2))){
        winner = "Gano el pokemon 2"
    }else {
        winner = "Gano el pokemon 1"
    }

    return winner
}

fun getDamage(attack: Int, defense: Int, effectiveness: Int) : Int {
    return 50 * (attack / defense) * effectiveness
}

fun getEffectiveness(typePokemon: Int): Int{

    var effectiveness = 0

    when(typePokemon){
        WATER ->{ }
    }

    if (typePokemon == WATER ){


    }

    return 1
}

const val WATER = 1    // 2 -3
const val FIRE = 2     // 3 -1
const val GRASS = 3    // 1 -2
const val ELECTRIC = 4 // 1 -3
