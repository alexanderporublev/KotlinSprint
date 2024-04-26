package lesson2

fun main() {
    var crystals = 7
    var ferrums = 11

    val buff = 0.2

    crystals += (crystals * buff).toInt()
    ferrums += (ferrums * buff).toInt()

    println("Current crystals amount: $crystals")
    println("Current ferrums amount: $ferrums")
}