package lesson18

class Point()

class Circle(val radius: Float,)

class Square(val width: Float,)

class Screen(){
    fun draw(x: Int, y: Int, point: Point,) = println("Рисуем точку на ($x;$y)")

    fun draw(x: Float, y: Float, point: Point,) = println("Рисуем точку на ($x;$y)")

    fun draw(x: Int, y: Int, circle: Circle,) = println("Рисуем круг на ($x;$y)")

    fun draw(x: Float, y: Float, circle: Circle,) = println("Рисуем круг на ($x;$y)")

    fun draw(x: Int, y: Int, square: Square,) = println("Рисуем квадрат на ($x;$y)")

    fun draw(x: Float, y: Float, square: Square, )= println("Рисуем квадрат на ($x;$y)")
}

fun main() {
    val screen = Screen()

    screen.draw(3, 6, Point())
    screen.draw(4.5f, 2.0f, Point())

    screen.draw(3, 6, Square(5f))
    screen.draw(4.5f, 2.0f, Square(5f))

    screen.draw(3, 6, Circle(5f))
    screen.draw(4.5f, 2.0f, Circle(5f))
}