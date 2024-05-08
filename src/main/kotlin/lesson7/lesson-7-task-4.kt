package lesson7

const val MILLIS_IN_SECOND = 1000L

fun main() {
    println("Введите количество секунд:")
    val seconds = readln().toInt()
    for (i in seconds downTo  1)
    {
        println("Осталось секунд: $i")
        Thread.sleep(MILLIS_IN_SECOND)
    }
    println("Время вышло")
}