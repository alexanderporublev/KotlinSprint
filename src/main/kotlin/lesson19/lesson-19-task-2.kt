package lesson19

import java.util.UUID

enum class GoodCategory {
                          Clothe {
                              override fun text(): String = "Одежда"
                          },
    Tools{
        override fun text(): String = "Инструменты"
    },
    Other{
        override fun text(): String = "Разное"
    };
    abstract fun text(): String
}

class Good(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val category: GoodCategory,
) {
    fun printInfo() = println("""
        Наименование: $name
        Категория: ${category.text()}
    """.trimIndent())
}

fun main() {
    Good(name = "Шорты", category = GoodCategory.Clothe).printInfo()
    Good(name = "Ножницы", category = GoodCategory.Tools).printInfo()
    Good(name = "Кольцо", category = GoodCategory.Other).printInfo()

}

