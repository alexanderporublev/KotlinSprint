package lesson10

fun generatePassword(length: Int) : String {
    val specialSymbols = "!\"#\$%&'()*+,-./ "
    var password = "" + (0..9).random() + specialSymbols[specialSymbols.indices.random()]

    while (password.length < length) {
        password += when ((0..1).random()) {
            0 -> (0..9).random()
            1 -> specialSymbols[specialSymbols.indices.random()]
            else -> 'u'
        }
    }

    return password.toList().shuffled().joinToString("")
}

fun main() {
    println("Введите длину пароля:")
    println("Пароль: ${generatePassword(readln().toInt())}")
}