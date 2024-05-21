package lesson14

import java.util.UUID

class Chat(
    val messages: MutableList<Message> = emptyList<Message>().toMutableList()
) {
    fun addMessage(message: String, author: String): Message {
        val messageObject = Message(UUID.randomUUID().toString(), message, author)
        messages.add(messageObject)
        return messageObject
    }

    fun addThreadMessage(message: String, author: String, parentMessageId: String): ChildMessage? {
        if (messages.find { it.id == parentMessageId } == null)
            return null
        val messageObject = ChildMessage(UUID.randomUUID().toString(), message, author, parentMessageId)
        messages.add(messageObject)
        return messageObject
    }

    private fun printThread(groupedMessage: Map<String?, List<Message>>, id: String? = null, prefix: String = "") {
        val list = groupedMessage[id]
        list?.forEach {
            println("$prefix${it.author}: ${it.message}")
            printThread(groupedMessage, it.id, prefix + "\t")
        }
    }

    fun printThread() {
        printThread(messages.groupBy { if (it is ChildMessage) it.parentMessageId else null })
    }
}

open class Message(
    val id: String,
    val message: String,
    val author: String,
)

class ChildMessage(
    id: String,
    message: String,
    author: String,
    val parentMessageId: String,
) : Message(id, message, author)

fun main() {
    val chat = Chat()
    val titleMessage1 = chat.addMessage("Привет всем", "Вова")
    val titleMessage2 = chat.addMessage("Какие планы на выходные", "Юля")

    val nestedMessageFor1 = chat.addThreadMessage("Привет Вова", "Катя", titleMessage1.id)

    val nestedMessageFor2 = chat.addThreadMessage("Будем спать весь день.", "Олег", titleMessage2.id)
    val doubleNestedMessageFor2 = chat.addThreadMessage("Лучше на пляж.", "Юля", nestedMessageFor2?.id ?: "Unknown")
    val nestedMessageFor22 = chat.addThreadMessage("Я работаю.", "Вася", titleMessage2.id)

    chat.printThread()
}