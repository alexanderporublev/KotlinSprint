package lesson13

const val NOTES_AMOUNT1 = 3

class Note5(
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
    val notes = listOf<Note5>().toMutableList()

    while (notes.size < NOTES_AMOUNT1) {
        println("\nВведите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Неверный формат номера")
            continue
        }

        println("Введите компанию:")
        val company = readln().ifEmpty { null }

        notes.add(Note5(name, phoneNumber, company))
    }

    notes.forEach {
        it.print()
        println()
    }
}
