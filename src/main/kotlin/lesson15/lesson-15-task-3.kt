package lesson15

abstract class User(
    val login: String,
    val password: String,
) {
    fun readMessage() = println("Читает сообщение")

    fun writeMessage() = println("Пишет сообщение")
}

class SimpleUser(
    login: String,
    password: String,
) : User(login, password)

class Administrator(
    login: String,
    password: String,
) : User(login, password) {
    fun deleteMessage() = println("Удаляет сообщение")

    fun deleteUser() = println("Удаляет пользователя")
}

fun main() {
    val simpleUser = SimpleUser("user", "qwertyiop")
    println("Обыкновенный пользователь:")
    simpleUser.readMessage()
    simpleUser.writeMessage()
    println()

    val administrator = Administrator("admin", "qwertyuiop")
    println("Администратор:")
    administrator.readMessage()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser()

}