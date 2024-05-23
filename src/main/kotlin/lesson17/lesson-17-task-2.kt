package lesson17

class Ship(
    name: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = name
        get() = field
        set(value) = println("Невозможно изменить имя корабля!")
}

fun main() {
    val ship = Ship("Решительный", 100.0, "Владивосток")
    ship.name = "Юрий Долгорукий"
}