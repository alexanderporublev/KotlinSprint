package lesson12

const val degreeSymbol1 = '\u00B0'

class WhetherData() {
    var dayTemperature = 0f
    var nightTemperature = 0f
    var rain = false

    fun print() = println(
        """
        Дневная температура: $dayTemperature${degreeSymbol1}C
        Ночная температура: $nightTemperature${degreeSymbol1}C
        Наличие осдаков: ${if (rain) "Были" else "Нет"}
    """.trimIndent()
    )
}

fun main() {
    val whether1 = WhetherData()
    whether1.rain = true
    whether1.dayTemperature = 30.5f
    whether1.nightTemperature = 16.5f

    whether1.print()
    println()

    val whether2 = WhetherData()
    whether2.rain = false
    whether2.dayTemperature = 11.2f
    whether2.nightTemperature = 16.5f

    whether2.print()
}