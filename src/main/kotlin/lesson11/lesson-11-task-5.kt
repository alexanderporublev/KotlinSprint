package lesson11

import java.util.*

class Member(
    val userId: String,
    val userName: String,
)

class Message(
    val authorId: String,
    val message: String,
)

class Forum(
    private val members: MutableList<Member> = emptyList<Member>().toMutableList(),
    private val messages: MutableList<Message> = emptyList<Message>().toMutableList(),
) {
    fun createMember(userName: String): Member {
        val member = Member(UUID.randomUUID().toString(), userName)
        members.add(member)
        return member
    }

    fun createMessage(authorId: String, message: String): Message? {
        if (members.find { it.userId == authorId } == null)
            return null

        val messageObject = Message(authorId, message)
        messages.add(messageObject)
        return messageObject
    }

    fun printThread() {
        messages.forEach {
            val authorId = it.authorId
            val memberName = members.find { it.userId == authorId }?.userName
            println("${memberName?:"unknown"}: ${it.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val alex = forum.createMember("alex")
    val bob = forum.createMember("bob")

    forum.createMessage(alex.userId, "Привет, Боб!")
    forum.createMessage(bob.userId, "Привет, Алекс!")

    forum.createMessage(alex.userId, "Рад тебя здесь видеть!")
    forum.createMessage(bob.userId, "Я тоже.")

    forum.printThread()
}