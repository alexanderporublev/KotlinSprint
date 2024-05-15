package lesson10

const val MIN_LENGTH = 4

fun isLengthValid(str: String) = str.length >= MIN_LENGTH

fun main() {
    println("Создайте логин:")
    val login = readln()

    println("Создайте пароль:")
    val password = readln()

    if (!isLengthValid(login) || !isLengthValid(password))
        println("Логин или пароль недостаточно длинные")
}