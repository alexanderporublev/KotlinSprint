package lesson13

const val NOTES_AMOUNT = 3

class Note4(
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
    val notes = listOf<Note4>().toMutableList()

    while (notes.size < NOTES_AMOUNT) {
        println("\nВведите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull() ?: continue

        println("Введите компанию:")
        val company = readln().ifEmpty { null }

        notes.add(Note4(name, phoneNumber, company))
    }

    notes.forEach {
        it.print()
        println()
    }
}
