package lesson9

fun main() {
    val ingredients = listOf("помидор", "мясо", "соус", "салат", "хлеб")
    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")
    ingredients.forEach{ println(it) }
}