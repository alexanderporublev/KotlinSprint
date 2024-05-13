package lesson9

const val INGREDIENTS_COUNT = 5
fun main() {
    val ingredientsSet = emptySet<String>().toMutableSet()

    for(i in 1..INGREDIENTS_COUNT) {
        println("Введите ингридиент $i:")
        ingredientsSet += readln()
    }

    println( ingredientsSet
        .sorted()
        .joinToString(", ")
        .replaceFirstChar { it.uppercase() }
    )

}