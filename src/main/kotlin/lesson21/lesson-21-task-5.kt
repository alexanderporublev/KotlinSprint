package lesson21

fun Map<String, Int>.maxCategory(): String = maxBy { it.value }.key

fun main() {
    val player = mapOf(
        "health" to 100,
        "power" to 150,
        "charm" to 20,
        "defence" to 170,
    )

    println(player.maxCategory())
}
