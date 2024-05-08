package lesson6

fun main() {
    println("Регистрация:")
    println("Введите имя пользователя:")

    val validLogin = readln()

    println("Введите пароль:")
    val validPassword = readln()

    do{
        println("Авторизация:")
        println("Введите имя пользователя:")
        val login = readln()
        println("Введите пароль:")
        val password = readln()
    } while (login != validLogin || password != validPassword)

    println("Авторизация прошла успешно!")
}