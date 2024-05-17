package lesson13

class Note3(
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
    val notes = listOf(
        Note3(
            name = "Александр",
            phoneNumber = 7967541672,
        ),
        Note3(
            name = "Вадим",
            phoneNumber = 8943799227,
        ),
        Note3(
            name = "Борис",
            phoneNumber = 897634567,
            company = "null",
        ),
        Note3(
            name = "Аля",
            phoneNumber = 876543322456,
            company = "Вкусно и точка",
        ),
        Note3(
            name = "Олег",
            phoneNumber = 8921456896,
            company = "Авто.ру",
        )
    )
    notes.forEach {
        it.print()
        println()
    }
}