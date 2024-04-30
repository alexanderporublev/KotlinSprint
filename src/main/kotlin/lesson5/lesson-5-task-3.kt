package lesson5

fun main() {
    val firstNumber = 9
    val secondNumber = 14

    println("Введите первое число:")
    val firstGuessedNumber = readlnOrNull()?.toInt()

    println("Введите второе число:")
    val secondGuessedNumber = readlnOrNull()?.toInt()

    if (firstGuessedNumber != null && secondGuessedNumber != null && firstGuessedNumber == firstNumber && secondGuessedNumber == secondNumber)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstGuessedNumber != null && firstGuessedNumber == firstNumber || secondGuessedNumber != null && secondGuessedNumber == secondNumber)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}
