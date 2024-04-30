package org.example.lesson3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"

    var currentAge = 20
    println("$surname $name $patronymic, $currentAge")

    surname = "Сидорова"

    currentAge = 22
    println("$surname $name $patronymic, $currentAge")
}