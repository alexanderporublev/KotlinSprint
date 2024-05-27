package lesson18

abstract class Animal(
    val name: String,
) {
    abstract val prefferedFood: String
    fun eat() = println("$name -> ест $prefferedFood")

    fun sleep() = println("Спит")
}

class Fox(name: String) : Animal(name) {
    override val prefferedFood: String = "ягоды"
}

class Dog(name: String) : Animal(name) {
    override val prefferedFood: String = "кости"
}

class Cat(name: String) : Animal(name) {
    override val prefferedFood: String = "рыбу"
}

fun main() {
    val listOfAnimals: List<Animal> = listOf(Cat("Вася"), Dog("Барбос"), Fox("Лариса"))
    listOfAnimals.forEach { it.eat() }
}