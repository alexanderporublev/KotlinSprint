package lesson4

const val COMFORT_HUMIDITY = 20
const val WINTER = "winter"
const val IS_SUNNY = true
const val IS_AWING_OPEN = true
fun main() {
    val isSunny = true
    val humidity = 20
    val isAwningOpen = true
    val timeOfYear = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny == IS_SUNNY && isAwningOpen == IS_AWING_OPEN && timeOfYear == WINTER && humidity == COMFORT_HUMIDITY}")
}