package lesson2

fun main() {
    val wayTime = 457

    val hour = 9
    val minute = 39

    val departureTimeInMinutes = hour * 60 + minute
    val arriveTimeInMinutes = departureTimeInMinutes + wayTime

    val arriveMinute = arriveTimeInMinutes % 60
    val arriveHour = (arriveTimeInMinutes / 60) % 24

    println("Arrive time: %02d:%02d".format(arriveHour, arriveMinute))
}