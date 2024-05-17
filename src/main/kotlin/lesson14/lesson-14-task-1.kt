package lesson14

const val LINEAR_SPEED = 10.toDouble()
const val LINEAR_LOAD_CAPACITY = 10.toDouble()
const val LINEAR_PASSENGERS_AMOUNT = 100

open class LinearSheep(
    val speed: Double = LINEAR_SPEED,
    val loadCapacity: Double = LINEAR_LOAD_CAPACITY,
    val passengersAmount: Int = LINEAR_PASSENGERS_AMOUNT,
)

const val CARGO_SPEED = 5.toDouble()
const val CARGO_LOAD_CAPACITY = 20.toDouble()
const val CARGO_PASSENGERS_AMOUNT = 40

class CargoSheep(
    speed: Double = CARGO_SPEED,
    loadCapacity: Double = CARGO_LOAD_CAPACITY,
    passengersAmount: Int = CARGO_PASSENGERS_AMOUNT,
    ) : LinearSheep(speed, loadCapacity, passengersAmount)

const val ICEBEAKER_SPEED = 3.toDouble()
const val ICEBEAKER_LOAD_CAPACITY = 7.toDouble()
const val ICEBEAKER_PASSENGERS_AMOUNT = 20

class Icebreaker(
    speed: Double = ICEBEAKER_SPEED,
    loadCapacity: Double = ICEBEAKER_LOAD_CAPACITY,
    passengersAmount: Int = ICEBEAKER_PASSENGERS_AMOUNT,
) : LinearSheep(speed, loadCapacity, passengersAmount) {
    val canBreakIce = true
}

fun main() {
    val linear = LinearSheep()
    val cargo = CargoSheep()
    val icebreaker = Icebreaker()
}