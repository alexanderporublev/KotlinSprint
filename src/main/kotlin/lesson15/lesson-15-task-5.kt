package lesson15

interface PassengerTransportable{
    fun loadPassengers(count: UInt = 1u) :UInt
    fun unloadPassengers(count: UInt = 1u):UInt
}

interface CargoTransportable{
    fun loadCargo(amount: Double = 1.0): Double
    fun unloadCargo(amount: Double = 1.0): Double
}

open class PassengerCar(
    val maxPassengersCount: UInt = 3u
) : PassengerTransportable {

    private var passengersCount = 0.toUInt()
    override fun loadPassengers(count: UInt):UInt {
        if (passengersCount + count <= maxPassengersCount)
            passengersCount += count

        return passengersCount
    }

    override fun unloadPassengers(count: UInt):UInt {
        if (passengersCount - count >= 0u)
            passengersCount -= count

        return passengersCount
    }
}

class CargoCar(
    val maxPassengersCount: UInt = 1u,
    val maxCargoAmount: Double = 2.0
) : PassengerTransportable, CargoTransportable {

    private var cargoAmount = 0.0
    private var passengersCount = 0u

    override fun loadPassengers(count: UInt):UInt {
        if (passengersCount + count <= maxPassengersCount)
            passengersCount += count

        return passengersCount
    }

    override fun unloadPassengers(count: UInt):UInt {
        if (passengersCount - count >= 0u)
            passengersCount -= count

        return passengersCount
    }
    override fun loadCargo(amount: Double): Double{
        if (cargoAmount + amount <= maxCargoAmount)
            cargoAmount += amount

        return cargoAmount
    }

    override fun unloadCargo(amount: Double): Double {
        if (cargoAmount - amount >= 0.0)
            cargoAmount -= amount

        return cargoAmount
    }
}

fun main() {
    val passengerCar1 = PassengerCar()
    val passengerCar2 = PassengerCar()
    val cargoCar = CargoCar()

    passengerCar1.loadPassengers(3u)
    passengerCar2.loadPassengers(2u)
    cargoCar.loadPassengers(1u)
    cargoCar.loadCargo(2.0)

    passengerCar1.unloadPassengers(3u)
    passengerCar2.unloadPassengers(2u)
    cargoCar.unloadPassengers(1u)
    cargoCar.unloadCargo(2.0)

}