package lesson18


interface Surface {
    fun surfaceSquare(): Double
}

class Cube(
    val ribLength: Double,
) : Surface {
    override fun surfaceSquare(): Double = 6 * ribLength * ribLength
}

class Parallelepiped(
    val length: Double,
    val width: Double,
    val height: Double,
) : Surface {
    override fun surfaceSquare(): Double = 2 * (length * width + length * height + height * width)
}

fun main() {
    println("Площадь поверхности куба: ${Cube(5.0).surfaceSquare()}")
    println("Площадь поверхности параллелепипеда: ${Parallelepiped(5.0, 3.0, 8.0).surfaceSquare()}")
}