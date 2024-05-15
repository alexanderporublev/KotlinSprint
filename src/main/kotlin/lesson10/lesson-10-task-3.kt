package lesson10

fun generatePassword(length: Int): String {
    var password = ""
    for (i in 0 until length)
        password += if (i % 2 == 0) (0..9).random() else (' '..'/').random()

    return password
}

fun main() {
    println("Введите длину пароля:")
    println("Пароль: ${generatePassword(readln().toInt())}")
}