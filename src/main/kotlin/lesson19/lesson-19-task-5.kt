package lesson19

enum class Sex(val humanName: String) {
    MALE("Мужской"),
    FEMALE("Женский");

    companion object {
        fun fromString(str: String): Sex = when (str) {
            "М" -> MALE
            "Ж" -> FEMALE
            else -> throw Exception("Неверный ввод пола")
        }
    }
}

class Human(
    val name: String,
    val sex: Sex,
)

fun main() {
    println(
        """
        Вводите по запросу имя человека и его пол,
        для добавления мужчины введите М, женщины - Ж
    """.trimIndent()
    )

    val humans = emptyList<Human>().toMutableList()
    while (humans.size < 5) {
        println("Введите имя:")
        val name = readln()
        println("Введите пол:")
        val sex = when (readln().uppercase()) {
            "M" -> Sex.MALE
            "Ж" -> Sex.FEMALE
            else -> {
                println("Невозможно распознать пол. Введите М или Ж")
                continue
            }
        }
        humans.add(Human(name, sex))
    }

    humans.forEach { println("Имя: ${it.name}\tПол: ${it.sex.humanName}") }

}