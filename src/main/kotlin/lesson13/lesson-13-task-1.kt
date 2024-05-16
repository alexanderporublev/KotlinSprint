package lesson13

class Note(
    val name: String,
    val phoneNumber: String,
    val company: String?,
)

fun main(){
    val note = Note(
        name = "Aleksandr",
        phoneNumber = "+7-967-541-92-12",
        company = null,
    )

    println("""
        name: ${note.name}
        phone: ${note.phoneNumber}
        company: ${note.company?:"unknown"}
    """.trimIndent())
}