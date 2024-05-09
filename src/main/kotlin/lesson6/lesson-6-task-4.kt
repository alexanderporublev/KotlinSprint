package lesson6

const val MAX_ATTEMPTS2 = 5

fun main() {
    val key = (1..9).random()
    var remainAttempts = MAX_ATTEMPTS2
    while (remainAttempts-- > 0) {
        println("Попробуйте угадать число:")
        val attempt = readln().toInt()
        if (attempt == key)
        {
            println("Это была великолепная игра!")
            return
        }
        else
            println("Неверно")
    }
    println("Было загадано число $key")
}