package lesson4

fun main() {
    val weatherIsSunny = true
    val humidity = 20
    val tentIsOpened = true
    val winterIsNow = true

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherIsSunny && tentIsOpened && !winterIsNow && humidity == 20}")
}