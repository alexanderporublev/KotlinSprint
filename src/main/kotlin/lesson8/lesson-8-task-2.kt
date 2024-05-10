package lesson8

fun main() {
    val ingredients = arrayOf("помидор", "мясо", "соус", "салат", "хлеб")
    println("Введите название ингридиента:")
    val inoutIngredient = readln()
    for(ingredient in ingredients) {
        if (inoutIngredient.lowercase() == ingredient) {
            println("Ингридиент $inoutIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}