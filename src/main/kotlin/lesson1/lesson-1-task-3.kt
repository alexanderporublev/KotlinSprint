package org.example.lesson1

fun main() {
    val year = "1961"
    var hour = "9"
    var minute = "7"
    println("${year.padStart(4, '0')}\n${hour.padStart(2, '0')}\n${minute.padStart(2,'0')}")
    hour = "10"
    minute = "55"
    print("${hour.padStart(2,'0')}:${minute.padStart(2,'0')}")
}