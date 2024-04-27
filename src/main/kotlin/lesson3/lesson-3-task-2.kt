package org.example.lesson3

fun main() {
    val birthName = "Татьяна"
    val birthPatronymic = "Сергеевна"
    val birthSurname = "Андреева"

    val ageWhenSurnameWasChanged = 22
    val newSurname = "Сидорова"

    var currentAge = 20
    println("${if (currentAge < ageWhenSurnameWasChanged) birthSurname else newSurname} $birthName $birthPatronymic, $currentAge")

    currentAge = 22
    println("${if (currentAge < ageWhenSurnameWasChanged) birthSurname else newSurname} $birthName $birthPatronymic, $currentAge")

}