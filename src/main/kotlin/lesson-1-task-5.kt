package org.example

fun main() {
    val secondsInMinute = 60
    val minutesInHour = 60
    val secondsInHour = minutesInHour * secondsInMinute
    val seconds = 6480
    val hour : Int = seconds / secondsInHour
    val minute : Int = (seconds - hour * secondsInHour) / minutesInHour
    val secondsRem = seconds % secondsInMinute

    println("%02d:%02d:%02d".format(hour, minute, secondsRem))

}