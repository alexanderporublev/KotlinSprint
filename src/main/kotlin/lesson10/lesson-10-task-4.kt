package lesson10

const val APPROVE_ANSWER = "да"

fun getRollResult1() = (1..6).random()

fun playRound(): Boolean {
    val humanResult = getRollResult1()
    val computerResult = getRollResult1()

    println("Результат игрока: $humanResult")
    println("Результат компьютера: $computerResult")

    if (humanResult > computerResult) {
        println("Вы победили!")
        return true
    } else {
        println("Победил компьютер")
        return false
    }
}


fun main() {
    var winCount = 0

    do {
        if (playRound()) winCount++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().lowercase() == APPROVE_ANSWER)

    println("Выиграно партий: $winCount")
}