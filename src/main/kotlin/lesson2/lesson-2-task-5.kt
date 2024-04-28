package lesson2

fun main() {
    val totalPercent = 100

    var capital : Double = 70000.0
    val percent = 16.7 / totalPercent

    var term = 20
    while (term-- > 0) {
        capital += capital * percent
    }

    println("Total capital after 20 years: %.3f".format(capital))
}