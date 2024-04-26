package org.example.lesson1

fun main() {
    val orderNumber = 75
    val greetingMessage = "Спасибо, что выбираете наш интернет-магазин"

    println("Number of orders $orderNumber")
    println(greetingMessage)

    var workersCount = 2000
    //println("Workers count $workersCount")
    workersCount--
    println("Workers count $workersCount")
}