package lesson5

fun main() {
    val first = (Math.random() * 100).toInt()
    val second = (Math.random() * 100).toInt()

    println("Докажите, что вы не робот. Решите простой пример.")
    println("$first + $second =")
    println("Введите ваш ответ:")

    val userSum = readlnOrNull()?.toInt()
    if (userSum != null && userSum == first + second)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}