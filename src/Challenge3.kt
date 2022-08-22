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
fun main() {
    area(Triangle(10.0, 5.0))
    area(Rectangle(10.0, 5.0))
    area(Square(10.0))
}

private fun area(polygon: Polygon): Double {
    polygon.printArea()
    return polygon.area()
}

interface Polygon {
    fun area(): Double
    fun printArea()
}

data class Triangle(val base: Double, val height: Double): Polygon {
    override fun area(): Double {
        return (base * height) / 2
    }

    override fun printArea() {
        println("El área del triangulo es ${area()}")
    }

}

data class Rectangle(val lengh: Double, val width: Double) : Polygon {
    override fun area(): Double {
        return lengh * width
    }

    override fun printArea() {
        println("El área del rectángulo es ${area()}")
    }

}

data class Square(val side: Double) : Polygon {
    override fun area(): Double {
        return side * side
    }

    override fun printArea() {
        println("El área del cuadrado es ${area()}")
    }

}