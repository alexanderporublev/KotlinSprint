package lesson17

class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password = password
        get() = List(field.length){'*'}.joinToString("")
        set(value) = println("Вы не можете изменить пароль")
}

fun main() {
    val user = User("login", "qwerty")
    user.login = "newlogin"
    println("Пароль: ${user.password}")
    user.password = "qwertyuiop"
}