import java.text.SimpleDateFormat
import java.util.*

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
* - You must search for each of the titles and their release day
* (if you can't find the exact day you can use the month, or even make it up)
*
 */
fun main() {
    println(ZeldaGame.THE_LEGEND_OF_ZELDA.timeBetweenRelease(ZeldaGame.ORACLE_OF_SEASONS))
}

private enum class ZeldaGame(val title: String) {

    THE_LEGEND_OF_ZELDA("The Legend of Zelda"),
    THE_ADVENTURE_OF_LINK("Zelda II: The Adventure of Link"),
    A_LINK_TO_THE_PAST("The Legend of Zelda: A Link to the Past"),
    LINKS_AWAKENING("The Legend of Zelda: Link's Awakening"),
    OCARINA_OF_TIME("The Legend of Zelda: Ocarina of Time"),
    MAJORAS_MASK("Zelda: Majora's Mask"),
    ORACLE_OF_SEASONS("The Legend of Zelda: Oracle of Seasons"),
    ORACLE_OF_AGES("The Legend of Zelda: Oracle of Ages"),
    FOUR_SWORDS("The Legend of Zelda: Four Swords"),
    THE_WIND_WAKER("The Legend of Zelda: The Wind Waker"),
    FOUR_SWORDS_ADVENTURES("The Legend of Zelda: Four Swords Adventures"),
    THE_MINISH_CUP("The Legend of Zelda: The Minish Cap"),
    TWILIGHT_PRINCES("The Legend of Zelda: Twilight Princess"),
    PHANTHOM_HOURGLASS("The Legend of Zelda: Phantom Hourglass"),
    SPIRIT_TRACKS("The Legend of Zelda: Spirit Tracks"),
    SKYWARD_SWORD("The Legend of Zelda: Skyward Sword"),
    A_LINK_BETWEEN_WORLDS("The Legend of Zelda: A Link Between Worlds"),
    TRI_FORCE_HEROES("The Legend of Zelda: Tri Force Heroes"),
    BREATH_OF_THE_WILD("The Legend of Zelda:  Breath of the Wild"),
    TEARS_OF_THE_KINGDOM("The Legend of Zelda: Tears of the Kingdom");

    /* A getter for the releaseDate property. */
    private var releaseDate: Date? = null
        get() {
            val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            return when (this) {
                THE_LEGEND_OF_ZELDA -> formatter.parse("21/02/1986")
                THE_ADVENTURE_OF_LINK -> formatter.parse("14/01/1987")
                A_LINK_TO_THE_PAST -> formatter.parse("21/11/1991")
                LINKS_AWAKENING -> formatter.parse("06/06/1993")
                OCARINA_OF_TIME -> formatter.parse("21/11/1998")
                MAJORAS_MASK -> formatter.parse("27/04/2000")
                ORACLE_OF_SEASONS, ORACLE_OF_AGES -> formatter.parse("27/02/2001")
                FOUR_SWORDS -> formatter.parse("03/12/2002")
                THE_WIND_WAKER -> formatter.parse("13/12/2002")
                FOUR_SWORDS_ADVENTURES -> formatter.parse("18/03/2004")
                THE_MINISH_CUP -> formatter.parse("04/11/2004")
                TWILIGHT_PRINCES -> formatter.parse("19/11/2006")
                PHANTHOM_HOURGLASS -> formatter.parse("23/06/2007")
                SPIRIT_TRACKS -> formatter.parse("07/12/2009")
                SKYWARD_SWORD -> formatter.parse("18/11/2011")
                A_LINK_BETWEEN_WORLDS -> formatter.parse("23/11/2013")
                TRI_FORCE_HEROES -> formatter.parse("11/10/2015")
                BREATH_OF_THE_WILD -> formatter.parse("03/03/2017")
                TEARS_OF_THE_KINGDOM -> formatter.parse("12/05/2023")
            }
        }

    fun timeBetweenRelease(game: ZeldaGame): String {
        if (this == game) {
            return "Se esta intentando comparar el mismo juego"
        }

        this.releaseDate?.let { currentReleaseDate ->
            game.releaseDate?.let { newReleaseDate ->

                val startDate = if (currentReleaseDate < newReleaseDate) currentReleaseDate else newReleaseDate
                val endDate = if (newReleaseDate > currentReleaseDate) newReleaseDate else currentReleaseDate

                val startCalendar = Calendar.getInstance()
                startCalendar.time = startDate
                val startReleaseYear = startCalendar.get(Calendar.YEAR)

                val endCalendar = Calendar.getInstance()
                endCalendar.time = endDate
                val endReleaseYear = endCalendar.get(Calendar.YEAR)

                var years = endReleaseYear - startReleaseYear

                startCalendar.set(Calendar.YEAR, endReleaseYear)

                // fecha inicial 27/06/1989 fecha final 01/01/2000
                if (startCalendar.timeInMillis > endCalendar.timeInMillis) {
                    startCalendar.set(Calendar.YEAR, endReleaseYear - 1)
                    years -= 1
                }

                val startMillis = getStartMillis(startCalendar, endCalendar)
                val endMillis = getEndMillis(endCalendar, startCalendar)

                val days = (endMillis - startMillis) / (60 * 60 * 24 * 1000)

                return "Entre la fecha de lanzamiento de ${this.title} y ${game.title} hay $years años y $days días"
            }
        }
        return "No se ha podido calcular el tiempo"
    }

    private fun getEndMillis(endCalendar: Calendar, startCalendar: Calendar) =
        if (endCalendar.timeInMillis > startCalendar.timeInMillis) endCalendar.timeInMillis else startCalendar.timeInMillis

    private fun getStartMillis(startCalendar: Calendar, endCalendar: Calendar) =
        if (startCalendar.timeInMillis < endCalendar.timeInMillis) startCalendar.timeInMillis else endCalendar.timeInMillis

}