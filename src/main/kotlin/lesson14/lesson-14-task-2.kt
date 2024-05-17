package lesson14

const val LINEAR_SPEED = 10.toDouble()
const val LINEAR_LOAD_CAPACITY = 10.toDouble()
const val LINEAR_PASSENGERS_AMOUNT = 100

open class LinearSheep2(
    val speed: Double = LINEAR_SPEED,
    val loadCapacity: Double = LINEAR_LOAD_CAPACITY,
    val passengersAmount: Int = LINEAR_PASSENGERS_AMOUNT,
) {
    open val loadSheepMethod = "выдвигает горизонтальный трап со шкафута"

    fun print() {
        printValues()
        printMethods()
    }

    protected open fun printValues() = println(
        """
        Скорость: $speed
        Грузоподъемность: $loadCapacity
        Вместимость: $passengersAmount
    """.trimIndent()
    )

    protected open fun printMethods() = println("Метод погрузки: $loadSheepMethod")
}

const val CARGO_SPEED = 5.toDouble()
const val CARGO_LOAD_CAPACITY = 20.toDouble()
const val CARGO_PASSENGERS_AMOUNT = 40

class CargoSheep2(
    speed: Double = CARGO_SPEED,
    loadCapacity: Double = CARGO_LOAD_CAPACITY,
    passengersAmount: Int = CARGO_PASSENGERS_AMOUNT,
) : LinearSheep2(speed, loadCapacity, passengersAmount) {
    override val loadSheepMethod = "активирует погрузочный кран"
}

const val ICEBREAKER_SPEED = 3.toDouble()
const val ICEBREAKER_LOAD_CAPACITY = 7.toDouble()
const val ICEBREAKER_PASSENGERS_AMOUNT = 20

class Icebreaker2(
    speed: Double = ICEBREAKER_SPEED,
    loadCapacity: Double = ICEBREAKER_LOAD_CAPACITY,
    passengersAmount: Int = ICEBREAKER_PASSENGERS_AMOUNT,
) : LinearSheep2(speed, loadCapacity, passengersAmount) {
    val canBreakIce = true

    override val loadSheepMethod = "открывает ворота со стороны кормы"

    override fun printValues() {
        super.printValues()
        println("Может колоть лед: ${if (canBreakIce) "да" else "нет"}")
    }
}

fun main() {
    val linear = LinearSheep2()
    val cargo = CargoSheep2()
    val icebreaker = Icebreaker2()

    linear.print()
    println()
    cargo.print()
    println()
    icebreaker.print()
}