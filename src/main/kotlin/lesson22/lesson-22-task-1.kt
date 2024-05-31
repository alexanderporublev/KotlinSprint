package lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regBook1 = RegularBook("Капитал", "Карл Маркс")
    val regBook2 = RegularBook("Капитал", "Карл Маркс")
    println(regBook1 == regBook2) // Сравниваются ссылки на объекты

    val dataBook1 = DataBook("Капитал", "Карл Маркс")
    val dataBook2 = DataBook("Капитал", "Карл Маркс")
    println(dataBook1 == dataBook2) // Для сравнения используется метод isEquals, который сравнивает все поля двух объектов попарно

}