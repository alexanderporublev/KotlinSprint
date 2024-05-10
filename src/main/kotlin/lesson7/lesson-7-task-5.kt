package lesson7

import kotlin.math.max

const val MINIMAL_PASSWORD_LENGHT = 6

fun main() {
    println("Введите длину пароля:")
    val passwordLength = max(readln().toInt(), MINIMAL_PASSWORD_LENGHT)
    var password = "" + ('0'..'9').random() + ('a' .. 'z').random() + ('A'..'Z').random()

    for(i in 1..passwordLength - 3){
        val symbol = when ((0..2).random()) {
            0 -> ('0'..'9').random()
            1 -> ('a' .. 'z').random()
            2 -> ('A'..'Z').random()
            else -> '.'
        }
        password += symbol
    }

    var shuffledPassword = ""
    password.toMutableList().shuffled().forEach{shuffledPassword += it}
    println(shuffledPassword)
}