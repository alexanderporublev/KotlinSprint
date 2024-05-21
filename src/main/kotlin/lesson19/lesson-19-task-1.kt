package lesson19

enum class Fish {Guppy, Angelfish, Goldfish, SiameseFightingFish}

fun main() {
    println("Вы можете добавить следующие виды рыб ${Fish.entries.joinToString()}")
}