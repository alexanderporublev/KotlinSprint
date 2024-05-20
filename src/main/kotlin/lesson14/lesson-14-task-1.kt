package lesson14


open class LinearSheep(
    val speed: Double = 10.toDouble(),
    val loadCapacity: Double = 10.toDouble(),
    val passengersAmount: Int = 100,
)


class CargoSheep(
    speed: Double = 5.toDouble(),
    loadCapacity: Double = 20.toDouble(),
    passengersAmount: Int = 40,
    ) : LinearSheep(speed, loadCapacity, passengersAmount)


class Icebreaker(
    speed: Double = 3.toDouble(),
    loadCapacity: Double = 7.toDouble(),
    passengersAmount: Int = 20,
) : LinearSheep(speed, loadCapacity, passengersAmount) {
    val canBreakIce = true
}

fun main() {
    val linear = LinearSheep()
    val cargo = CargoSheep()
    val icebreaker = Icebreaker()
}