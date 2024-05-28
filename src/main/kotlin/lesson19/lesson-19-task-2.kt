package lesson19

import java.util.UUID

enum class GoodCategory { Clothe, Tools, Other;

    fun getCategoryName(): String = when(this) {
        Clothe -> "Одежда"
        Tools -> "Инструменты"
        Other -> "Разное"
    }
}

class Good(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val category: GoodCategory,
) {
    fun printInfo() = println("""
        Наименование: $name
        Категория: ${category.getCategoryName()}
    """.trimIndent())
}

fun main() {
    Good(name = "Шорты", category = GoodCategory.Clothe).printInfo()
    Good(name = "Ножницы", category = GoodCategory.Tools).printInfo()
    Good(name = "Кольцо", category = GoodCategory.Other).printInfo()

}

