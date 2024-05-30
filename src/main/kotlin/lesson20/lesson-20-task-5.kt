package lesson20

class Bot(
) {
    private var modifier: (String) -> String = {str -> str}

    fun say() {
        println(modifier(knownPhrases[(0 until knownPhrases.size).random()]))
    }

    fun setModifier(newModifier: (String) -> String){
        modifier = newModifier
    }

    companion object{
        val knownPhrases = listOf("будем знакомы", "рад вас видеть", "хорошая погода", "очень здорово", "будьте здоровы")
    }
}

fun main(){
    val bot = Bot()
    bot.setModifier { "Не $it" }
    bot.say()
}