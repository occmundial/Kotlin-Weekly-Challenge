import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

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
 var gamesArray = ArrayList<Zeldas>()
 fun main(){
     //
 }

 fun covertDate(dateFG: String, dateSG: String): String{
     val sdf = SimpleDateFormat("dd/MM/yyyy")
     val firstDate: Date = sdf.parse(dateFG)
     val secondDate: Date = sdf.parse(dateSG)

     val dateViewFG = Calendar.getInstance()
     dateViewFG.time = firstDate!!
     val dateViewSG = Calendar.getInstance()
     dateViewSG.time = secondDate!!

     if(firstDate.after(secondDate)){
         //
     }else{
         //
     }

     return ""
 }


 fun initData(){
     gamesArray.add(Zeldas("The Legend of Zelda", "22/08/1986"))
     gamesArray.add(Zeldas("The Adventure of Link", "01/12/1988"))
     gamesArray.add(Zeldas("A Link to the Past", "13/05/1992"))
     gamesArray.add(Zeldas("Link's Awakening", "01/08/1993"))
     gamesArray.add(Zeldas("Ocarina of Time", "23/11/1998"))
     gamesArray.add(Zeldas("Majora's Mask", "26/10/2000 "))
     gamesArray.add(Zeldas("Oracle of Seasons y Oracle of Ages", "14/05/2001"))
     gamesArray.add(Zeldas("The Wind Waker", "24/03/2003"))
     gamesArray.add(Zeldas("A Link to the Past/Four Swords", "02/12/2002"))
     gamesArray.add(Zeldas( "Four Swords Adventures", "07/06/2004"))
     gamesArray.add(Zeldas("The Minish Cap", "10/01/2005"))
     gamesArray.add(Zeldas( "Twilight Princess", "19/11/2006"))
     gamesArray.add(Zeldas("Phantom Hourglass", "01/10/2007 "))
     gamesArray.add(Zeldas( "Spirit Tracks", "07/12/2009"))
     gamesArray.add(Zeldas( "Skyward Sword", "20/11/2011"))
     gamesArray.add(Zeldas( "A Link Between Worlds", "22/11/2013"))
     gamesArray.add(Zeldas( "Tri Force Heroes", "23/10/2015"))
     gamesArray.add(Zeldas( "Breath of the Wild", "03/03/2017"))
     gamesArray.add(Zeldas("Tears of the Kingdom", "12/05/2023"))
 }
 data class Zeldas(
     var name: String = "",
     var date: String = "01/01/1900"
 )