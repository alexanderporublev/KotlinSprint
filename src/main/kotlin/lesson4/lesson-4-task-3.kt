package lesson4

const val COMFORT_HUMIDITY = 20
const val WINTER = "winter"
const val COMFORT_WEATHER = "sunny"
const val COMFORT_TENT_STATE = "opened"
fun main() {
    val weather = "sunny"
    val humidity = 20
    val tentState = "opened"
    val timeOfYear = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weather == COMFORT_WEATHER && tentState == COMFORT_TENT_STATE && timeOfYear == WINTER && humidity == COMFORT_HUMIDITY}")
}