package lesson14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val canLand: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    canLand: Boolean,
    val satellites: List<Satellite> = emptyList()
): CelestialBody(name, hasAtmosphere, canLand)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    canLand: Boolean,
): CelestialBody(name, hasAtmosphere, canLand)

fun main() {
    val planet = Planet(
        name = "Марс",
        hasAtmosphere = true,
        canLand = true,
        listOf(
            Satellite("Фобос", false, false,),
            Satellite("Деймос", false, false,)
        ),
    )

    println("Планета: ${planet.name}")
    println("Спутники: ${planet.satellites.joinToString(", ") { it.name }}")
}