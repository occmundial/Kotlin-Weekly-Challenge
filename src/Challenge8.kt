/*
* Challenge #8
*
* Date: 10/10/2022
* Difficulty: Medium
*
* Middle-earth is at war! In it will fight races loyal to Sauron
 * against other kind ones who do not want evil to reign over their lands.
 * Each race has an associated "value" between 1 and 5:
 * - Kind Races: Furry (1), Good Southerners (2), Dwarves (3), Númenóreans (4), Elves (5)
 * - Evil Races: Evil Southlanders (2), Orcs (2), Goblins (2), Wargs (3), Trolls (5)
 * Create a program that calculates the result of the battle between the 2 types of armies:
 * - The result may be that the good wins, the evil wins, or there is a tie. Depending on the
 * sum of the value of the army and the number of members.
 * - Each army can be composed of a variable number of members of each race.
 * - You have complete freedom to model the exercise data.
 * Ex: 1 Hairy loses against 1 Orc, 2 Hairy tie against 1 Orc, 3 Hairy win against 1 Orc.
 */

const val Hobbit = 0
const val Southerners = 1
const val Dwarves = 2
const val Numenoreans = 3
const val Elves = 4

const val Southlanders = 0
const val Orcs = 1
const val Goblins = 2
const val Wargs = 3
const val Trolls = 4

val EvilPower = mapOf(
    Southlanders to 2,
    Orcs to 2,
    Goblins to 2,
    Wargs to 3,
    Trolls to 5
)

val GoodPower = mapOf(
    Hobbit to 1,
    Southerners to 2,
    Dwarves to 3,
    Numenoreans to 4,
    Elves to 5
)

data class GoodsArmy(
    val Hobbit: Int = 0,
    val Southerners: Int = 0,
    val Dwarves: Int = 0,
    val Numenoreans: Int = 0,
    val Elves: Int = 0,
)

data class EvilsArmy(
    val Southlanders: Int = 0,
    val Orcs: Int = 0,
    val Goblins: Int = 0,
    val Wargs: Int = 0,
    val Trolls: Int = 0,
)

fun main() {
    val goods = GoodsArmy(2, 0, 0, 0, 0)
    val evils = EvilsArmy(0, 1, 0, 0, 0)
    battle(goods, evils)
}

fun battle(goodsArmy: GoodsArmy, evilsArmy: EvilsArmy) {
    var goodsArmyPower = 0
    for (i in 0..4) {
        val num = when(i) {
            0 -> goodsArmy.Hobbit
            1 -> goodsArmy.Southerners
            2 -> goodsArmy.Dwarves
            3 -> goodsArmy.Numenoreans
            4 -> goodsArmy.Elves
            else -> 0
        }
        goodsArmyPower += (GoodPower[i] ?: 0) * num
    }

    var evilsArmyPower = 0
    for (i in 0..4) {
        val num = when(i) {
            0 -> evilsArmy.Southlanders
            1 -> evilsArmy.Orcs
            2 -> evilsArmy.Goblins
            3 -> evilsArmy.Wargs
            4 -> evilsArmy.Trolls
            else -> 0
        }
        evilsArmyPower += (EvilPower[i] ?: 0) * num
    }

    if (goodsArmyPower > evilsArmyPower) {
        println("Good wins")
    } else if (evilsArmyPower > goodsArmyPower) {
        println("Evil wins")
    } else {
        println("Is a tie")
    }
}