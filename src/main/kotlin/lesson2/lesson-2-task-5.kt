package lesson2

fun main() {
    val totalPercent = 100

    var capital : Double = 70000.0
    val percent = 16.7 / totalPercent

    val term = 20

    capital += capital * Math.pow(1 + percent, term.toDouble())

    println("Total capital after 20 years: %.3f".format(capital))
}