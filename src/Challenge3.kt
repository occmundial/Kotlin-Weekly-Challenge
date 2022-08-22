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
    val cuadrado = Cuadrado()
    val rectangle = Rectangle()
    val triangulo = Triangulo()
    var calculaArea: Float = cuadrado.area(10.0F, 10.0f)
    println("El area del Cuadrado es: $calculaArea")
    calculaArea = rectangle.area(15F, 10F)
    println("El area del Rectangulo es: $calculaArea")
    calculaArea = triangulo.area(5.0F, 10.0F)
    println("El area del Triangulo es: $calculaArea")
}

open class Figura {
    private var base:Float = 0.0F
    private var altura:Float = 0.0F

    companion object{
        const val AREA_CONSTANT = 2
    }

    interface calculaArea {
        fun area(base:Float, altura:Float) :Float
    }
}

class Cuadrado: Figura(), Figura.calculaArea {

    override fun area(base:Float, altura:Float) :Float{
        return base * altura
    }
}

open class Rectangle: Figura(), Figura.calculaArea{

    override fun area(base:Float, altura:Float) :Float{
        return base * altura
    }
}

class Triangulo: Figura(), Figura.calculaArea{

    override fun area(base:Float, altura:Float) :Float{
        return (base * altura)/AREA_CONSTANT
    }
}