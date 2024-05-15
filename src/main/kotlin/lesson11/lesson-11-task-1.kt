package lesson11

class User1(
    val id: String,
    val login: String,
    val password: String,
    val email: String,
) {
    fun print() {
        println("""
            id      :   $id
            login   :   $login
            password:   $password
            email   :   $email
        """.trimIndent())
    }
}

fun main() {
    val user1 = User1(
        id = "1111",
        login = "lex",
        password = "qwerty",
        email = "lex@gmail.com",
    )

    val user2 = User1(
        id = "1234",
        login = "angel",
        password = "lkjuiop",
        email = "qwerty@yandex.ru",
    )

    user1.print()
    println()
    user2.print()
}