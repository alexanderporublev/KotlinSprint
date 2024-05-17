package lesson14

const val LINEAR_SPEED = 10.toDouble()
const val LINEAR_LOAD_CAPACITY = 10.toDouble()
const val LINEAR_PASSENGERS_AMOUNT = 100

open class LinearSheep(
    val speed: Double = LINEAR_SPEED,
    val loadCapacity: Double = LINEAR_LOAD_CAPACITY,
    val passengersAmount: Int = LINEAR_PASSENGERS_AMOUNT,
)

class CargoSheep(
    speed: Double = LINEAR_SPEED,
    loadCapacity: Double = LINEAR_LOAD_CAPACITY,
    passengersAmount: Int = LINEAR_PASSENGERS_AMOUNT,
    ) : LinearSheep(speed, loadCapacity,passengersAmount)

class Icebreaker(    speed: Double = LINEAR_SPEED,
                     loadCapacity: Double = LINEAR_LOAD_CAPACITY,
                     passengersAmount: Int = LINEAR_PASSENGERS_AMOUNT,
                     val isIcebreaker: Boolean = true,
) : LinearSheep(speed, loadCapacity,passengersAmount)

