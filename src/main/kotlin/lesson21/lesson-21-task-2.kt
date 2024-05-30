package lesson21

fun List<Int>.evenNumbersSum(): Int = sumOf { if (it % 2 == 0) it else 0 }

fun main() {
    println(listOf(2, 3, 6, 5, 12, 13).evenNumbersSum())
}