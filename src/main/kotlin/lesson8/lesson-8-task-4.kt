package lesson8

fun main() {
    val ingredients = arrayOf("помидор", "мясо", "соус", "салат", "хлеб")

    println("Список ингридиентов:")
    ingredients.forEach { println(it) }
    println()

    println("Какой ингридиент вы хотите заменить?")
    val inputIngredient = readln()
    if (inputIngredient !in ingredients) {
        println("Такого ингридиентв нет в списке")
        return
    }

    println("Какой ингридиент вы хотите использовать?")
    val newIngredient = readln()
    ingredients[ingredients.indexOf(inputIngredient)] = newIngredient

    println()
    println("Список ингридиентов:")
    ingredients.forEach { println(it) }
    println()
}