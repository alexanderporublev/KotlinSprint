package lesson7

fun main() {
    var inputCode = 0

    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации $code")
        println("Введите код авторизации:")
        inputCode = readln().toInt()
    } while (inputCode != code)

    println("Добро пожаловать!")
}