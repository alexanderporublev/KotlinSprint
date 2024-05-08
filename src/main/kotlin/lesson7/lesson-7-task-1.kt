package lesson7

const val PASSWORD_LENGHT = 6

fun main() {
    var password = ""
    for(i in 1..PASSWORD_LENGHT)
    {
        val symbol = if (i % 2 == 0) ('a'..'z').random() else (0..9).random()
        password += symbol
    }

    println(password)
}