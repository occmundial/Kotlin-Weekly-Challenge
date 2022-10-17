import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.math.abs

/*
* Challenge #9
*
* Date: 17/10/2022
* Difficulty: Medium
*
* THE RELEASES OF "THE LEGEND OF ZELDA"
*
* They have announced a new "The Legend of Zelda"! It will be called "Tears of the Kingdom" and will be released on May 12, 2023.
* But do you remember how much time has passed between the different "The Legend of Zelda" in history?
*
* Create a program that calculates how many years and days there are between 2 Zelda games that you select.
* - You must search for each of the titles and their release day (if you can't find the exact day you can use the month, or even make it up)
*
 */

val listOfGames: MutableList<Pair<String, LocalDate>> = arrayListOf()

fun main() {
    listOfGames.add(Pair("A Link to the Past", LocalDate.parse("1986-02-21")))
    listOfGames.add(Pair("The Adventure of Link", LocalDate.parse("1987-01-14")))
    listOfGames.add(Pair("A Link to the Past", LocalDate.parse("1991-11-21")))
    listOfGames.add(Pair("Link's Awakening", LocalDate.parse("1993-06-06")))
    listOfGames.add(Pair("Ocarina of Time", LocalDate.parse("1998-11-27")))
    listOfGames.add(Pair("Majora's Mask", LocalDate.parse("2000-04-27")))
    println(compareDates("A Link to the Past", "Link's Awakening"))
}

fun compareDates(game1: String, game2: String): String {
    var date1: LocalDate? = null
    var date2: LocalDate? = null
    listOfGames.forEach {
        if (it.first == game1) date1 = it.second
        if (it.first ==  game2) date2 = it.second
    }
    var days = abs(ChronoUnit.DAYS.between(date1, date2))
    val years = (days / 365).toInt()
    days = days - (years * 365)
    val months = (days / 30).toInt()
    days = days - (months * 30)
    return "Años: $years, Meses: $months, Días: $days"
}