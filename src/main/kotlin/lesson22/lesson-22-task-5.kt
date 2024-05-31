package lesson22

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime? = null,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Яркая звезда в созвездии Центавра",
        distanceFromEarth = 4.26
    )

    println("""
        Наименование: ${alphaCentauri.component1()}
        Описание: ${alphaCentauri.component2()}
        Дата: ${alphaCentauri.component3()?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) ?:"Нет данных"}
        Расстояние от Земли: ${alphaCentauri.component4()} св. лет
    """.trimIndent())

}