package lesson15

abstract class WeatherStationStats()

class Temperature(val temperatureValue: Double): WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Double): WeatherStationStats()

class WeatherServer() {
    fun sendWeatherMessage(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> println("Температура: ${stats.temperatureValue}")
            is PrecipitationAmount -> println("Количество осадков: ${stats.precipitationAmount}")
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()

    weatherServer.sendWeatherMessage(Temperature(30.0))
    weatherServer.sendWeatherMessage(PrecipitationAmount(12.0))

}