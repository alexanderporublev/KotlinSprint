package lesson5

fun main() {
    val numbersAmount = 3
    val maxNumber = 42
    val requiredNumbers = emptySet<Int>().toMutableSet()

    while (requiredNumbers.count() < numbersAmount)
        requiredNumbers += (1..maxNumber).random()

    //!!Раскомментировать для отладки
    //requiredNumbers.forEach { it -> print("$it ")  }

    val userNumbers = emptySet<Int>().toMutableSet()
    for(i in 1..numbersAmount)
    {
        println("Введите очередное число:")
        userNumbers += readlnOrNull()?.toInt()?:-1
    }

    val guessedNumbers = userNumbers.intersect(requiredNumbers)
    when (guessedNumbers.count()) {
        0 -> println("Не угадано ни одного числа.")
        1 -> println("Вы выиграли утешительный приз.")
        2 -> println("Вы выиграли крупный приз.")
        3 -> println("Вы выиграли главный приз.")
    }
}