const val degreeSymbol = '\u00B0'

const val ZERO_ABSOLUTE1 = 273

fun kelvinToCelsius(temperatureKelvin: Int) = temperatureKelvin - ZERO_ABSOLUTE1

class WhetherData2(
    dayTemperature: Int,
    nightTemperature: Int,
    rain: Boolean,
) {
    val dayTemperature = kelvinToCelsius(dayTemperature)
    val nightTemperature = kelvinToCelsius(nightTemperature)
    val rain = rain

    fun print() = println(
        """
        Дневная температура: ${dayTemperature}${degreeSymbol}C
        Ночная температура: ${nightTemperature}${degreeSymbol}C
        Наличие осдаков: ${if (rain) "Были" else "Нет"}
    """.trimIndent()
    )
}

fun main() {
    val whether1 = WhetherData2(
        rain = true,
        dayTemperature = 300,
        nightTemperature = 290,
    )

    whether1.print()
}