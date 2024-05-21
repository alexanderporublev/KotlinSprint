package lesson19

import com.sun.media.sound.InvalidFormatException

enum class Sex {
    MALE {
        override fun string(): String = "Мужской"
    },
    FEMALE {
        override fun string(): String = "Женский"
    };
    abstract fun string(): String
    companion object{
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
    println("""
        Вводите по запросу имя человека и его пол,
        для добавления мужчины введите М, женщины - Ж
    """.trimIndent())

    val humans = emptyList<Human>().toMutableList()
    while (humans.size < 5)
        try {
            println("Введите имя:")
            val name = readln()
            println("Введите пол:")
            val sex = Sex.fromString(readln())
            humans.add(Human(name, sex))
        }
        catch (e: Exception){
            println("Невозможно распознать пол. Введите М или Ж")
        }

    humans.forEach { println("Имя: ${it.name}\tПол: ${it.sex.string()}") }

}