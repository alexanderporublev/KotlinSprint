package lesson7

fun main() {
    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации $code")
        println("Введите код авторизации:")
        val inputCode = readln().toInt()
    } while (inputCode != code)

    println("Добро пожаловать!")
}