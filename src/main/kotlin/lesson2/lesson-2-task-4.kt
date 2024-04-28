package lesson2

fun main() {
    val baseCrystals = 7
    val baseFerrums = 11

    val buff = 20
    val fullPercents = 100

    val buffedCystals = (baseCrystals * buff / fullPercents).toInt()
    val buffedFerrums = (baseFerrums * buff / fullPercents).toInt()

    println("Buffed crystals amount: $buffedCystals")
    println("Buffed ferrums amount: $buffedFerrums")
}