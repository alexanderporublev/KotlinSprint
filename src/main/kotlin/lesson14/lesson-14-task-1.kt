package lesson14


open class LinearSheep(
    val speed: Double = 10.0,
    val loadCapacity: Double = 10.0,
    val passengersAmount: Int = 100,
)


class CargoSheep(
    speed: Double = 5.0,
    loadCapacity: Double = 20.0,
    passengersAmount: Int = 40,
    ) : LinearSheep(speed, loadCapacity, passengersAmount)


class Icebreaker(
    speed: Double = 3.0,
    loadCapacity: Double = 7.0,
    passengersAmount: Int = 20,
) : LinearSheep(speed, loadCapacity, passengersAmount) {
    val canBreakIce = true
}

fun main() {
    val linear = LinearSheep()
    val cargo = CargoSheep()
    val icebreaker = Icebreaker()
}