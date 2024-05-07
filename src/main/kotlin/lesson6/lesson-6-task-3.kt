package lesson6
const val MILLIS_IN_SECOND = 1000L

fun main() {

    println("Введите количество секунд, которое нужно засечь:")
    var seconds = readln().toInt()
    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(MILLIS_IN_SECOND)
        seconds--
    }
    println("Время вышло")
}