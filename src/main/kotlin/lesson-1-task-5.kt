package org.example

fun main() {
    val seconds = 3600 + 30 * 60 + 9
    val hour : Int = seconds / 3600
    val minute : Int = (seconds - hour * 3600) / 60
    val secondsRem = seconds % 60

    println("%02d:%02d:%02d".format(hour, minute, secondsRem))

}