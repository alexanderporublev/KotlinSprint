package lesson14


open class LinearSheep2(
    val speed: Double = 10.0,
    val loadCapacity: Double = 10.0,
    val passengersAmount: Int = 100,
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


class CargoSheep2(
    speed: Double = 5.0,
    loadCapacity: Double = 20.0,
    passengersAmount: Int = 40,
) : LinearSheep2(speed, loadCapacity, passengersAmount) {
    override val loadSheepMethod = "активирует погрузочный кран"
}


class Icebreaker2(
    speed: Double = 3.0,
    loadCapacity: Double = 7.0,
    passengersAmount: Int = 20,
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