package lesson15

interface Flyable {
    fun fly()
}

interface Swimming {
    fun swim()
}


class Carp()
    :Swimming {
    override fun swim() {
        println("Карась плавает")
    }
}

class Gull() : Flyable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck() : Flyable, Swimming {
    override fun fly() {
        println("Утка может плавать")
    }

    override fun swim() {
        println("Утка может летать")
    }

}

fun main() {
    Carp().swim()
    println()
    Gull().fly()
    println()
    val duck = Duck()
    duck.fly()
    duck.swim()
}