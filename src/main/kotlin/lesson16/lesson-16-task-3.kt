package lesson16

class User(
    val login: String,
    private val password: String,
) {
    fun checkPassword(attemptPassword: String): Boolean = attemptPassword == password
}

fun main() {
    val user = User("petrov", "qwertyuiop")

    val attempt1 = "qwerty"
    println("Попытка $attempt1: ${user.checkPassword(attempt1)}")

    val attempt2 = "qwertyuiop"
    println("Попытка $attempt2: ${user.checkPassword(attempt2)}")
}