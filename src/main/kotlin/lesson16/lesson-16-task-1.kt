package lesson16

class Dice{
    private val value = (1..6).random()

    fun printValue() = println("Выпало значение: $value")
}

fun main() {
    val dice = Dice()
    dice.printValue()
}