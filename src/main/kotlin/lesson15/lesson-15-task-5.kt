package lesson15

interface PassengerTransportable{
    fun loadPassengers(count: UInt = 1.toUInt()) :UInt
    fun unloadPassengers(count: UInt = 1.toUInt()):UInt
}

interface CargoTransportable{
    fun loadCargo(amount: Double = 1.toDouble()): Double
    fun unloadCargo(amount: Double = 1.toDouble()): Double
}

open class PassengerCar(
    val maxPassengersCount: UInt = 3.toUInt()
) : PassengerTransportable {

    private var passengersCount = 0.toUInt()
    override fun loadPassengers(count: UInt):UInt {
        if (passengersCount + count <= maxPassengersCount)
            passengersCount += count

        return passengersCount
    }

    override fun unloadPassengers(count: UInt):UInt {
        if (passengersCount - count >= 0.toUInt())
            passengersCount -= count

        return passengersCount
    }
}

class CargoCar(
    val maxPassengersCount: UInt = 1.toUInt(),
    val maxCargoAmount: Double = 2.toDouble()
) : PassengerTransportable, CargoTransportable {

    private var cargoAmount = 0.toDouble()
    private var passengersCount = 0.toUInt()

    override fun loadPassengers(count: UInt):UInt {
        if (passengersCount + count <= maxPassengersCount)
            passengersCount += count

        return passengersCount
    }

    override fun unloadPassengers(count: UInt):UInt {
        if (passengersCount - count >= 0.toUInt())
            passengersCount -= count

        return passengersCount
    }
    override fun loadCargo(amount: Double): Double{
        if (cargoAmount + amount <= maxCargoAmount)
            cargoAmount += amount

        return cargoAmount
    }

    override fun unloadCargo(amount: Double): Double {
        if (cargoAmount - amount <= maxCargoAmount)
            cargoAmount -= amount

        return cargoAmount
    }
}

fun main() {
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()
    val cargoCar = CargoCar()

    passengerCar1.loadPassengers(3.toUInt())
    passengerCar2.loadPassengers(2.toUInt())
    cargoCar.loadPassengers(1.toUInt())
    cargoCar.loadCargo(2.toDouble())

    passengerCar1.unloadPassengers(3.toUInt())
    passengerCar2.unloadPassengers(2.toUInt())
    cargoCar.unloadPassengers(1.toUInt())
    cargoCar.unloadCargo(2.toDouble())

}