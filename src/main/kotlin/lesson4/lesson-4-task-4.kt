package lesson4

fun main() {
    val exerciseArm = "Упражнения для рук"
    val exerciseLegs = "Упражнения для ног"
    val exerciseBack = "Упражнения для спины"
    val exercisePress = "Упражнения для пресса"
    val variantsAmount = 2
    val currentDay = 5

    val isOddDay = currentDay % variantsAmount == 0
    println("""
        $exerciseArm:        ${!isOddDay}
        $exerciseLegs:        $isOddDay
        $exerciseBack:      $isOddDay
        $exercisePress:     ${!isOddDay}
    """.trimIndent())
}