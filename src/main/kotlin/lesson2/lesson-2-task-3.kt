package lesson2

fun main() {
    val wayTime = 457

    val hour = 9
    val minute = 39

    val minutesInHour = 60
    val hoursInDay = 24

    val departureTimeInMinutes = hour * minutesInHour + minute
    val arriveTimeInMinutes = departureTimeInMinutes + wayTime

    val arriveMinute = arriveTimeInMinutes % minutesInHour
    val arriveHour = (arriveTimeInMinutes / minutesInHour) % hoursInDay

    println("Arrive time: %02d:%02d".format(arriveHour, arriveMinute))
}