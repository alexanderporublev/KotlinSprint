package lesson4

fun main() {
    val totalTableAmount = 13
    val busyTablesToday = 13
    val busyTableTomorrow = 9

    println("Доступность столиков на сегодня: ${busyTablesToday < totalTableAmount}")
    println("Доступность столиков на завтра: ${busyTableTomorrow < totalTableAmount}")
}