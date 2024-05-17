const val degreeSymbol = '\u00B0'

const val ZERO_ABSOLUTE = 273

fun convertKelvinToCelsius(temperatureKelvin: Int) = temperatureKelvin - ZERO_ABSOLUTE

class WhetherData3(
    dayTemperature: Int,
    nightTemperature: Int,
    rain: Boolean,
) {
    init {
        print()
    }

    val dayTemperature = convertKelvinToCelsius(dayTemperature)
    val nightTemperature = convertKelvinToCelsius(nightTemperature)
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
    val whether1 = WhetherData3(
        rain = true,
        dayTemperature = 300,
        nightTemperature = 290,
    )
}