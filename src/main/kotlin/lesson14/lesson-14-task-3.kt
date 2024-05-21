package lesson14

import java.awt.Color
import javax.swing.tree.FixedHeightLayoutCache

abstract class Figure(
    val color: Color,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    val radius: Double,
    color: Color,
) : Figure(color) {
    override fun calculateArea(): Double = Math.PI * radius * radius

    override fun calculatePerimeter(): Double = Math.PI * radius * 2
}

class Polygon(
    val width: Double,
    val height: Double,
    color: Color,
) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = 2 * (width + height)
}

fun main() {
    val list = listOf<Figure>(
        Polygon(10.toDouble(), 20.toDouble(), Color.BLACK),
        Polygon(18.toDouble(), 5.toDouble(), Color.WHITE),
        Circle(5.toDouble(), Color.BLACK),
        Circle(9.toDouble(), Color.WHITE),
    )

    println("Сумма периметров всех черных фигур: ${list.sumOf { if (it.color == Color.BLACK) it.calculatePerimeter() else 0.toDouble() }}")
    println("Сумма площадей всех белых фигур: ${list.sumOf { if (it.color == Color.WHITE) it.calculateArea() else 0.toDouble() }}")
}