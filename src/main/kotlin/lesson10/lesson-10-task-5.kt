package lesson10

const val VALID_LOGIN = "alexandr"
const val VALID_PASSWORD = "qwerty"

const val TOKEN_LENGTH = 32

fun authorization(login: String, password: String) : String? {
    if (login != VALID_LOGIN || password != VALID_PASSWORD)
        return null

    var token = ""

    while (token.length < TOKEN_LENGTH) {
        token += when((0..2).random()) {
            0 -> (0..9).random()
            1 -> ('a'..'z').random()
            2 -> ('A' .. 'Z').random()
            else -> '.'
        }
    }

    return token
}

fun main() {
    val basket = listOf("мыло", "прошок", "кофе")

    val login = "alexandr"
    val password = "qwerty"

    if (authorization(login, password) == null) {
        println("Неверный логин или пароль.")
        return
    }

    println("Корзина содержит:")
    basket.forEach{ println(it) }
}