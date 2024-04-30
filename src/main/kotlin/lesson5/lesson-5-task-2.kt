package lesson5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = LocalDate.now().year

    println("Введите год своего рожедения:")
    val yearOfBirth = readlnOrNull()?.toInt()

    if (yearOfBirth != null && currentYear - yearOfBirth >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернуть пользователя на главный экран.")
}