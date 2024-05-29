package lesson22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {
    println(RegularBook2("Ангелы и демоны", "Дэн Браун").toString()) // Проеобразует в строку ссылку на объект
    println(DataBook2("Ангелы и демоны", "Дэн Браун").toString()) // Выводит все поля, применяя к ним метод toString()
}