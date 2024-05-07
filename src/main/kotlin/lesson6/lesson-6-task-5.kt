package lesson6

const val MAX_ATTEMPTS = 3

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

        val num1 = (1..9).random()
        val num2 = (1..9).random()

        var remainAttempts = MAX_ATTEMPTS
        while (remainAttempts > 0)
        {
            println("Решите пример $num1+$num2=")
            val sum = readln().toInt()
            if (sum == num2 + num1)
                break
            remainAttempts--
        }

        if (remainAttempts > 0)
            println("Добро пожаловать!")
        else{
            println("Доступ запрещен!")
            return
        }
    } while (login != validLogin || password != validPassword)

    println("Авторизация прошла успешно!")
}