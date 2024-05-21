package lesson20

fun main() {
    val listOfString = listOf("One", "Two", "Three", "Four")
    listOfString.map { { println("Нажат элемент $it") } }
        .forEachIndexed { index, function -> if (index % 2 == 1) function() }
}