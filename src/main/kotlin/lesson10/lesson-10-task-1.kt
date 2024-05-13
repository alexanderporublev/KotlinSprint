package lesson10

fun getRollResult() = (1..6).random()

fun main() {
    val humanRollResult = getRollResult()
    val computerRollResult = getRollResult()

    println("Результат игрока: $humanRollResult")
    println("Результат компьютера: $computerRollResult")

    if (humanRollResult > computerRollResult)
        println("Победило человечество")
    else
        println("Побкдила машина")
}