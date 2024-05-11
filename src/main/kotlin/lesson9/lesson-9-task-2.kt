package lesson9

const val APPROVE_ANSWER = "да"

fun main() {
    val ingredients = mutableListOf("помидор", "мясо", "соус")

    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { println(it) }
    println()

    println("Желаете добавить еще?")
    if (readln() != APPROVE_ANSWER)
        return

    println("Какой ингредиент вы хотите добавить?")
    ingredients += readln()

    println("Теперь в рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
    println()
}
