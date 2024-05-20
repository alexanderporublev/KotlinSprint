const val DEGREE_SYMBOL1 = '\u00B0'

const val ZERO_ABSOLUTE2 = 273

fun convertKelvinToCelsius1(temperatureKelvin: Int) = temperatureKelvin - ZERO_ABSOLUTE2

class WhetherData3(
    dayTemperature: Int,
    nightTemperature: Int,
    rain: Boolean,
) {
    init {
        print()
    }

    val dayTemperature = convertKelvinToCelsius1(dayTemperature)
    val nightTemperature = convertKelvinToCelsius1(nightTemperature)
    val rain = rain

    fun print() = println(
        """
        Дневная температура: ${dayTemperature}${DEGREE_SYMBOL1}C
        Ночная температура: ${nightTemperature}${DEGREE_SYMBOL1}C
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