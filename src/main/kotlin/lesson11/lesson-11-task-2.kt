package lesson11

class User(
    val id: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun print() {
        println("""
            id      :   $id
            login   :   $login
            password:   $password
            email   :   $email
            bio     :   $bio
        """.trimIndent())
    }

    fun addBio() {
        println("Заполните информацию о себе:")
        bio = readln()
    }

    fun changePassword(){
        println("Текущий пароль:")
        if (readln() != password) {
            println("Пароль невернный")
            return
        }
        println("Новый пароль:")
        password = readln()
    }
}

fun main() {
    val user = User(
        id = "1111",
        login = "lex",
        password = "qwerty",
        email = "lex@gmail.com",
    )

    user.addBio()
    user.changePassword()
    user.print()
}