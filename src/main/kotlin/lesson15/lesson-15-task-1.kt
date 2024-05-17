package lesson15

interface Flyable {
    fun fly()
}

interface Swimming {
    fun swim()
}

abstract class Animal() {
    fun printAbilities() {
        if (this is Flyable)
            fly()

        if (this is Swimming)
            swim()
    }
}

class Carp()
    :Animal(), Swimming {
    override fun swim() {
        println("Карась плавает")
    }
}

class Gull() :Animal(), Flyable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck() : Animal(), Flyable, Swimming {
    override fun fly() {
        println("Утка может плавать")
    }

    override fun swim() {
        println("Утка может летать")
    }

}

fun main() {
    listOf(Carp(), Gull(), Duck()).forEach {
        it.printAbilities()
        println()
    }
}