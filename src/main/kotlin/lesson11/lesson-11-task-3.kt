package lesson11

class Feed(
    val rooms : MutableList<Room> = emptyList<Room>().toMutableList(),
)

class Room(
    val wallpaper: String,
    val title: String,
    val participants: MutableList<Participant> = emptyList<Participant>().toMutableList(),
) {
    fun addParticipant(participant: Participant) = participants.add(participant)

    fun changeParticipantStatus(nickname: String, newStatus: String) = participants.replaceAll {
            if (it.nickname == nickname) it.status = newStatus
            it
        }

    fun onAvatarClicked(avatar: String) : Participant? = participants.find { it.avatar == avatar }

}

class Participant(
    val avatar: String,
    val nickname: String,
    var status: String,
) {
    fun print() = println("""
        avatar: $avatar
        nickname: $nickname
        status: $status
    """.trimIndent())

    companion object {
        const val STATUS_SPEAKING = "Разговаривает"
        const val STATUS_MICROFON_OFF = "Микрофон выключен"
        const val STATUS_MUTED = "пользователь заглушен"
    }
}

fun main() {
    val participant1 = Participant(
        "avatar1",
        "lex",
        Participant.STATUS_SPEAKING
    )

    val participant2 = Participant(
        "avatar2",
        "lena",
        Participant.STATUS_MICROFON_OFF
    )

    val room = Room(
        "wallpaper",
        "title",
        listOf(participant1, participant2).toMutableList()
    )

    room.addParticipant(
        Participant(
            "avatar3",
            "vanya",
            Participant.STATUS_MICROFON_OFF
            ))

    room.changeParticipantStatus("vanya", Participant.STATUS_MUTED)
    room.participants.forEach{
        it.print()
        println()
    }

    println("Выбран")
    room.onAvatarClicked("avatar2")?.print()
}