import java.util.*

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


lateinit var naturalDictionaryKind: Map<String, Int>
lateinit var naturalDictionaryEvil: Map<String, Int>
fun main(){

    createDictionariesRangesKind()
    createDictionariesRangesEvil()

    //Primer Ejercito
    val mapKind = TreeMap<String, Int>()
    mapKind["Furry"] = 10
    mapKind["Good Southerners"] = 2
    mapKind["Dwarves"] = 3
    mapKind["Númenóreans"] = 40
    mapKind["Elves"] = 5

    //vs Segundo ejercito
    val mapEvil = TreeMap<String, Int>()
    mapEvil["Evil Southlanders"] = 10
    mapEvil["Orcs"] = 2
    mapEvil["Goblins"] = 3
    mapEvil["Wargs"] = 40
    mapEvil["Trolls"] = 5

    //Resultado de la batalla
}

private fun batalla(ejercito1: TreeMap<String, Int>, ejercito2: TreeMap<String, Int>): String{

    


    return ""
}

private fun powerBattle(ejercito1: TreeMap<String, Int>): Int{
    var totalpower: Int = 0

    for((race, numberOfSoldiers) in ejercito1){



        println("$race : $numberOfSoldiers")

        val powerrange = naturalDictionaryKind[race]

        totalpower += (powerrange!! * numberOfSoldiers)
    }

    return 1
}

private fun createDictionariesRangesKind() {
    naturalDictionaryKind = mapOf(
        "Furry" to 1,
        "Good Southerners" to 2,
        "Dwarves" to 3,
        "Númenóreans" to 4,
        "Elves" to 5
    )

    naturalDictionary.forEach {
        morseDictionary[it.value] = it.key
    }
}

private fun createDictionariesRangesEvil() {
    naturalDictionaryEvil = mapOf(
        "Evil Southlanders" to 2,
        "Orcs" to 2,
        "Goblins" to 2,
        "Wargs" to 3,
        "Trolls" to 5
    )

    naturalDictionary.forEach {
        morseDictionary[it.value] = it.key
    }
}