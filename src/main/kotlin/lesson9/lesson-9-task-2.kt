package lesson9

const val approveAnswer = "да"

fun main() {
    val ingredients = mutableListOf("помидор", "мясо", "соус")

    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { println(it) }
    println()

    println("Желаете добавить еще?")
    if (readln() != approveAnswer)
        return

    println("Какой ингредиент вы хотите добавить?")
    ingredients += readln()

    println("Теперь в рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
    println()
}
