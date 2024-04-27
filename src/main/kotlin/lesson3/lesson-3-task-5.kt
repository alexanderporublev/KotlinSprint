package lesson3

fun main() {
    val move = "D2-D4;0"
    try {
        val (from, to, number) = move.split(';', '-')
        println("FROM: $from")
        println("TO: $to")
        println("MOVE NUMBER: $number")
    } catch (e: IndexOutOfBoundsException) {
        println("Wrong input")
    }

}