package lesson4

const val COMFORT_HUMIDITY = 20
const val WINTER = "winter"

fun main() {
    val weatherIsSunny = true
    val humidity = 20
    val tentIsOpened = true
    val timeOfYear = WINTER

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherIsSunny && tentIsOpened && timeOfYear == WINTER && humidity == COMFORT_HUMIDITY}")
}