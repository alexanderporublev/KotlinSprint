package lesson19

enum class Fish(var nameFish: String) {
    Guppy("Гуппи"),
    Angelfish("Скалярия"),
    Goldfish("Золотая рыбка"),
    SiameseFightingFish("Петушок"),
}

fun main() {
    println("Вы можете добавить следующие виды рыб ${Fish.entries.map { it.nameFish }.joinToString()}")
}