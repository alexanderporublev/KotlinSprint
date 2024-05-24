package lesson17

class Parcel(
    val parcelNumber: String,
    currentLocation: String,

) {
    var currentLocation = currentLocation
        set(value) {
            field = value
            counter++
        }

    private var counter: Int = 0

    fun getCount() = counter
}

fun main(){
    val parcel = Parcel("111", "New York")
    println("Counter: ${parcel.getCount()}")
    parcel.currentLocation = "Chicago"
    println("Counter: ${parcel.getCount()}")
    parcel.currentLocation = "Melbourne"
    println("Counter: ${parcel.getCount()}")
    parcel.currentLocation = "Beijing"
    println("Counter: ${parcel.getCount()}")
}