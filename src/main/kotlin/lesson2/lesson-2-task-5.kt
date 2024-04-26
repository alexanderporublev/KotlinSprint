package lesson2

fun main() {
    var capital : Double = 70000.0
    val percent = 0.167

    var term = 20
    while (term-- > 0) {
        capital += capital * percent
    }

    println("Total capital after 20 years: %.3f".format(capital))
}