package lesson16

class Circle(
    private val radius: Double
) {
    private val Pi = 3.14

    fun getSquare(): Double = Pi * radius * radius

    fun getPerimeter(): Double = 2 * Pi * radius
}

fun main() {
    val circle = Circle(5.0)
    println("""
        Длина окружности: ${circle.getPerimeter()}
        Площадь: ${circle.getSquare()}
    """.trimIndent())
}