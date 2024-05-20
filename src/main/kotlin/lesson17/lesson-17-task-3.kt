package lesson17

class Directory(
    name: String,
    filesCount: Int = 0,
    val isSecret: Boolean = false
) {
    val name = name
        get() = if (isSecret) HIDDEN_DIRECTORY else field

    val filesCount = filesCount
        get() = if (isSecret) 0 else field

    companion object {
        const val HIDDEN_DIRECTORY = "скрытая папка"
    }
}

fun main() {
    val hiddenDirectory = Directory("Новая папка", 50, true)
    println("Имя папки: ${hiddenDirectory.name}\tКоличество файлов:${hiddenDirectory.filesCount}")
}