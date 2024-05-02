package lesson4

const val MIN_WEIGHT = 35
const val MAX_WIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val weightVariant1 = 20
    val volumeVariant1 = 80
    println("Соответствие категории Average: ${weightVariant1 >= MIN_WEIGHT && weightVariant1 <= MAX_WIGHT && volumeVariant1 < MAX_VOLUME}")

    val weightVariant2 = 50
    val volumeVariant2 = 100
    println("Соответствие категории Average: ${weightVariant2 >= MIN_WEIGHT && weightVariant2 <= MAX_WIGHT && volumeVariant2 < MAX_VOLUME}")
}