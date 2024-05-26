package lesson18

abstract class PlayCube(
){
    abstract val edgeCount: Int

    fun calculateValue() = println("Выпало значение ${(1..edgeCount).random()}")
}

class Cube4Edge() : PlayCube() {
    override val edgeCount = 4
}

class Cube6Edge() : PlayCube() {
    override val edgeCount = 6
}

class Cube8Edge() : PlayCube() {
    override val edgeCount = 8
}

fun main() {
    listOf(Cube4Edge(), Cube6Edge(), Cube8Edge()).forEach { it.calculateValue() }
}