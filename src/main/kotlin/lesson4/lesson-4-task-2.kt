package lesson4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val weightVariant1 = 20
    val volumeVariant1 = 80
    println("Соответствие категории Average: ${weightVariant1 >= minWeight && weightVariant1 <= maxWeight && volumeVariant1 < maxVolume}")

    val weightVariant2 = 50
    val volumeVariant2 = 100
    println("Соответствие категории Average: ${weightVariant2 >= minWeight && weightVariant2 <= maxWeight && volumeVariant2 < maxVolume}")
}