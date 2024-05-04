package lesson5

fun main() {
    val first = (1..100).random()
    val second = (1..100).random()

    println("Докажите, что вы не робот. Решите простой пример.")
    println("$first + $second =")
    println("Введите ваш ответ:")

    val userSum = readln().toInt()
    if (userSum == first + second)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}