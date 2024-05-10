package lesson8

fun main() {
    val ingredients = arrayOf("помидор", "мясо", "соус", "салат", "хлеб")
    println("Введите название ингридиента:")
    val inoutIngredient = readln()
    if (inoutIngredient.lowercase() in ingredients)
        println("Ингридиент $inoutIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")

}