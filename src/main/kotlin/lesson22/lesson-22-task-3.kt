package lesson22

data class DataBook3(
    val name: String,
    val author: String,
    val genre: String,
)

fun main() {
    val book = DataBook3("Ангелы и демоны", "Дэн Браун", "Детектив")
    val (name, author, genre) = book
    println("Имя: $name, Автор: $author, Жанр: $genre")
}