const val degreeSymbol = '\u00B0'

const val ZERO_ABSOLUTE = 273
const val DAYS_IN_MONTH = 30

const val MIN_DAILY_TEMPERATURE = -15 + ZERO_ABSOLUTE
const val MAX_DAILY_TEMPERATURE = 30 + ZERO_ABSOLUTE

fun kelvinToCelsius(temperatureKelvin: Int) = temperatureKelvin - ZERO_ABSOLUTE

class WhetherData4(
    dayTemperature: Int,
    nightTemperature: Int,
    rain: Boolean,
) {
    var dayTemperature = kelvinToCelsius(dayTemperature)
    var nightTemperature = kelvinToCelsius(nightTemperature)
    var rain = rain

    fun print() = println(
        """
        Дневная температура: ${dayTemperature}${degreeSymbol}C
        Ночная температура: ${nightTemperature}${degreeSymbol}C
        Наличие осдаков: ${if (rain) "Были" else "Нет"}
    """.trimIndent()
    )
}

fun main() {
    val weatherDayByBay = emptyList<WhetherData4>().toMutableList()

    while (weatherDayByBay.size < DAYS_IN_MONTH)
        weatherDayByBay.add(
            WhetherData4(
                (MIN_DAILY_TEMPERATURE..MAX_DAILY_TEMPERATURE).random(),
                (MIN_DAILY_TEMPERATURE..MAX_DAILY_TEMPERATURE).random(),
                (0..1).random() == 1,
            )
        )

    val dayTemperatureList = weatherDayByBay.map { it.dayTemperature }
    val nightTemperatureList = weatherDayByBay.map { it.nightTemperature }
    val rainDayList = weatherDayByBay.map { it.rain }

    println("""
        Средняя дневная температура: ${dayTemperatureList.average()}${degreeSymbol}C
        Ночная температура: ${nightTemperatureList.average()}${degreeSymbol}C
        Наличие осдаков: ${rainDayList.count { it }}"}
    """.trimIndent())
}