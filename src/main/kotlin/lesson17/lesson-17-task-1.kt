package lesson17

class Question(
    question: String,
    answer: String,
) {
    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}