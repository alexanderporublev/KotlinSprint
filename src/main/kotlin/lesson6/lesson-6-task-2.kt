package lesson6

const val MILLIS_IN_SECOND = 1000

fun main() {

    println("Введите количество секунд, которое нужно засечь:")
    val seconds = readln().toLong()
    Thread.sleep(seconds * MILLIS_IN_SECOND)
    println("Прошло $seconds секунд")
}