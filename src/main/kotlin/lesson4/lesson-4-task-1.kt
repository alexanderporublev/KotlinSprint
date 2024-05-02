package lesson4

const val TOTAL_TABLE_AMOUNT = 13

fun main() {
    val busyTablesToday = 13
    val busyTableTomorrow = 9

    println("Доступность столиков на сегодня: ${busyTablesToday < TOTAL_TABLE_AMOUNT}")
    println("Доступность столиков на завтра: ${busyTableTomorrow < TOTAL_TABLE_AMOUNT}")
}