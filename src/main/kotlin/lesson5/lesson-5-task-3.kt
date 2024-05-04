package lesson5

fun main() {
    val firstNumber = 9
    val secondNumber = 14

    println("Введите первое число:")
    val firstGuessedNumber = readln().toInt()

    println("Введите второе число:")
    val secondGuessedNumber = readln().toInt()

    val firstGuessed = firstGuessedNumber == firstNumber || secondGuessedNumber == firstNumber
    val secondGuessed = firstGuessedNumber == secondNumber || secondGuessedNumber == secondNumber

    if (firstGuessed && secondGuessed)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstGuessed || secondGuessed)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}
