package lesson13

class Note2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun print() = println(
        """
        Имя: $name
        Номер: $phoneNumber}
        Компания: ${company ?: "не указано"}
    """.trimIndent()
    )
}

fun main() {
    val note = Note2(
        name = "Александр",
        phoneNumber = 79675419212,
    )
    note.print()
}