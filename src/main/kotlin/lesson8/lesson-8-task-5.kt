package lesson8

fun main() {
    println("Введите количество ингридиентов:")
    val count = readln().toInt()
    if (count <= 0)
    {
        println("Колтчество ингридентов должно быть больше 0")
        return
    }

    val ingredients = arrayOfNulls<String>(count)
    ingredients.forEachIndexed { index, it ->
        println("Введите очередной ингридент:")
        ingredients[index] = readln()
    }

    println("\nСоздан рецепт:")
    ingredients.forEach { println(it) }
}