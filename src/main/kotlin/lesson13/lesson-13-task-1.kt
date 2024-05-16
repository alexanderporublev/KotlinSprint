package lesson13

class Note(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main(){
    val note = Note(
        name = "Aleksandr",
        phoneNumber = 79675419212,
        company = null,
    )

    println("""
        name: ${note.name}
        phone: ${note.phoneNumber}
        company: ${note.company?:"unknown"}
    """.trimIndent())
}