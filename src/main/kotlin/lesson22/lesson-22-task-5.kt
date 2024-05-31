package lesson22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime? = null,
    val distanceFromEarth: Double,
)

fun main(){
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Яркая звезда в созвездии Центавра",
        distanceFromEarth = 4.26
    )

    println(alphaCentauri.toString())
}