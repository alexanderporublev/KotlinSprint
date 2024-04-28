package lesson4

fun main() {
    val exerciseArm = "Упражнения для рук"
    val exerciseLegs = "Упражнения для ног"
    val exerciseBack = "Упражнения для спины"
    val exercisePress = "Упражнения для пресса"
    val variantsAmount = 2
    val currentDay = 5

    println("""
        $exerciseArm:        ${currentDay % variantsAmount == 1}
        $exerciseLegs:        ${currentDay % variantsAmount == 0}
        $exerciseBack:      ${currentDay % variantsAmount == 0}
        $exercisePress:     ${currentDay % variantsAmount == 1}
    """.trimIndent())
}