/*
* Challenge #8
*
* Date: 10/10/2022
* Difficulty: Medium
*
* Middle-earth is at war! In it will fight races loyal to Sauron
 * against other kind ones who do not want evil to reign over their lands.
 * Each race has an associated "value" between 1 and 5:
 * - Kind Races: Hobbit (1), Good Southerners (2), Dwarves (3), Númenóreans (4), Elves (5)
 * - Evil Races: Evil Southlanders (2), Orcs (2), Goblins (2), Wargs (3), Trolls (5)
 * Create a program that calculates the result of the battle between the 2 types of armies:
 * - The result may be that the good wins, the evil wins, or there is a tie. Depending on the
 * sum of the value of the army and the number of members.
 * - Each army can be composed of a variable number of members of each race.
 * - You have complete freedom to model the exercise data.
 * Ex: 1 Hobbit loses against 1 Orc, 2 Hobbit tie against 1 Orc, 3 Hobbit win against 1 Orc.
 */
fun main() {
    println(battleForTheMiddleEarth(
        listOf(Pair(KindArmy.HOBBIT, 1)),
        listOf(Pair(EvilArmy.ORC, 1))
    ))

    battleForTheMiddleEarth(
        listOf(Pair(KindArmy.ELF, 1)),
        listOf(Pair(EvilArmy.TROLL, 1)))

    battleForTheMiddleEarth(
        listOf(Pair(KindArmy.ELF, 1), Pair(KindArmy.HOBBIT, 1)),
        listOf(Pair(EvilArmy.TROLL, 1)))

    battleForTheMiddleEarth(
        listOf(Pair(KindArmy.ELF, 1), Pair(KindArmy.HOBBIT, 1)),
        listOf(Pair(EvilArmy.TROLL, 1), Pair(EvilArmy.ORC, 1)))

    battleForTheMiddleEarth(
        listOf(Pair(KindArmy.ELF, 56), Pair(KindArmy.HOBBIT, 80), Pair(KindArmy.DWARF, 5)),
        listOf(Pair(EvilArmy.TROLL, 17), Pair(EvilArmy.ORC, 51), Pair(EvilArmy.WARG, 10), Pair(EvilArmy.SOUTHERNER, 2)))
}

enum class KindArmy() {
    HOBBIT, SOUTHERNER, DWARF, NUMENOREAN, ELF;

    val bravery: Int
        get() {
            return when (this) {
                HOBBIT -> 1
                SOUTHERNER -> 2
                DWARF -> 3
                NUMENOREAN -> 4
                ELF -> 5
            }
        }
}

enum class EvilArmy() {
    SOUTHERNER, ORC, GOBLIN, WARG, TROLL;

    val bravery: Int
        get() {
            return when (this) {
                SOUTHERNER, ORC, GOBLIN -> 2
                WARG -> 3
                TROLL -> 5
            }
        }
}

private fun battleForTheMiddleEarth(
    kindArmy: List<Pair<KindArmy, Int>>,
    evilArmy: List<Pair<EvilArmy, Int>>
): String {

    var kindArmyPoint = 0
    var evilArmyPoint = 0

    kindArmy.forEach { army ->
        kindArmyPoint =+ army.first.bravery * army.second
    }

    evilArmy.forEach { army ->
        evilArmyPoint += army.first.bravery * army.second
    }

    return if (kindArmyPoint > evilArmyPoint) {
        "Gana el bien"
    } else if (evilArmyPoint > kindArmyPoint) {
        "Gana el mal"
    } else {
        "Empate"
    }

}

fun metodo(): Pair<Int, String> {
    return 1 to "si"
}

fun main1() {
    val (status, mensaje) = metodo()
    print(status)
    print(mensaje)
}