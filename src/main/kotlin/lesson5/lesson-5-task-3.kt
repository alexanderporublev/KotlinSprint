package lesson5

fun main() {
    val firstNumber = 9
    val secondNumber = 14

    println("Введите первое число:")
    val firstGuessedNumber = readlnOrNull()?.toInt()

    println("Введите второе число:")
    val secondGuessedNumber = readlnOrNull()?.toInt()

    val firstGuessed = firstGuessedNumber != null && firstGuessedNumber == firstNumber || secondGuessedNumber != null && secondGuessedNumber == firstNumber
    val secondGuessed = firstGuessedNumber != null && firstGuessedNumber == secondNumber || secondGuessedNumber != null && secondGuessedNumber == secondNumber

    if (firstGuessed && secondGuessed)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstGuessed || secondGuessed)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}
