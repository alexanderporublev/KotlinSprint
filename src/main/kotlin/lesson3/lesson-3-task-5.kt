package lesson3

fun main() {
    val move = "D2-D4;0"

    val (from, to, number) = move.split(';', '-')

    println("FROM: $from")
    println("TO: $to")
    println("MOVE NUMBER: $number")
}