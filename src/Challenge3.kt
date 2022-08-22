/*
* Challenge #3
*
* Date: 22/08/2022
* Difficulty: Medium
* Create ONE SINGLE FUNCTION (important that it is only one) that is capable of calculating and returning the area of a polygon.
* - The function will receive by parameter only ONE polygon at a time.
* - The supported polygons will be Triangle, Square and Rectangle.
* - Prints the calculation of the area of a polygon of each type.
*
*/

data class Poligono(
    val base: Float,
    val altura: Float,
    val sides: ArrayList<Float>
)
fun main() {
    val triangulo = Poligono(8.0f, 6.92f, arrayListOf(8.0f, 8.0f, 8.0f))
    val cuadrado = Poligono(10.0f, 10.0f, arrayListOf(10.0f, 10f, 10f, 10.0f))
    val rectangulo = Poligono(10.0f, 8.0f, arrayListOf(8.0f, 10f, 8f, 10.0f))
    println(calculateArea(triangulo))
}

fun calculateArea(poligono: Poligono): String {
    return when(poligono.sides.size) {
        3 -> "Triangulo: ${(poligono.base * poligono.altura) / 2}"
        4 -> if (poligono.base == poligono.altura) {
                "Cuadrado: ${poligono.sides[0] * poligono.sides[1]}"
            } else {
                "Rectangulo: ${poligono.base * poligono.altura}"
            }
        else -> "Error"
    }
}