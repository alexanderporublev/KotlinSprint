package lesson2

import kotlin.math.pow

fun main() {
    val totalPercent = 100

    var capital : Double = 70000.0
    val percent = 16.7 / totalPercent

    val term = 20

    capital *=(1 + percent).pow(term)

    println("Total capital after 20 years: %.3f".format(capital))
}