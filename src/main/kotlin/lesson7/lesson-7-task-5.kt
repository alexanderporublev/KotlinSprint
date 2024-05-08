package lesson7

import kotlin.math.max

const val MINIMAL_PASSWORD_LENGHT = 6

fun main() {
    println("Введите длину пароля:")
    val passwordLength = max(readln().toInt(), MINIMAL_PASSWORD_LENGHT)
    var password = ""
    for(i in 1..passwordLength){
        val symbol = when ((0..2).random()) {
            0 -> ('0'..'9').random()
            1 -> ('a' .. 'z').random()
            2 -> ('A'..'Z').random()
            else -> '.'
        }
        password += symbol
    }
    println(password)
}