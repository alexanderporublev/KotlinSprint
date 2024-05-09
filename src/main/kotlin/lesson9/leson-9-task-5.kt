package lesson9

const val INGREDIENTS_COUNT = 5
fun main() {
    val ingredientsList = emptyList<String>().toMutableList()

    for(i in 1..INGREDIENTS_COUNT) {
        println("Введите ингридиент $i:")
        ingredientsList += readln()
    }

    println( ingredientsList
        .sorted()
        .joinToString(", ")
        .mapIndexed { index, c -> if (index == 0) c.uppercase() else c }
        .joinToString("") )
}