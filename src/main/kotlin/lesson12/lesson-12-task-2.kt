package lesson12

const val degreeSymbol = '\u00B0'

class WhetherData1(
    val dayTemperature: Float,
    val nightTemperature: Float,
    var rain: Boolean,
) {
    fun print() = println(
        """
        Дневная температура: $dayTemperature${degreeSymbol}C
        Ночная температура: $nightTemperature${degreeSymbol}C
        Наличие осдаков: ${if (rain) "Были" else "Нет"}
    """.trimIndent()
    )
}

fun main() {
    val whether1 = WhetherData1(
        rain = true,
        dayTemperature = 30.5f,
        nightTemperature = 16.5f,
    )

    whether1.print()
}