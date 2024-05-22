package lesson21

import java.io.File

fun File.prependText(text: String) =
    writeText("${text.lowercase()}\n" + readLines().joinToString("\n"))

fun main() {
    val file = File("lesson21.txt")
    file.createNewFile()
    file.writeText("""
        123
        321
        432
    """.trimIndent())

    file.prependText("hello")
}
