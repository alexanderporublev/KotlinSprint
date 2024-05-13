package lesson9

const val ITEMS_ABBREVIATION = "шт."
const val GRAM_ABBREVIATION = "гр."
const val VOLUME_MILLIS_ABBREVIATION = "мл."

const val EGGS_BASE_COUNT = 2
const val MILK_BASE_COUNT = 50
const val BUTTER_COUNT = 15

fun main() {
    val onePortionConsists = listOf(EGGS_BASE_COUNT, MILK_BASE_COUNT, BUTTER_COUNT)

    println("Введите количество порций:")
    val portionsCount = readln().toInt()

    val resultList = onePortionConsists.map { it * portionsCount }

    println("На $portionsCount порций вам понадобится: Яиц – ${resultList[0]}$ITEMS_ABBREVIATION," +
            " молока – ${resultList[1]}$VOLUME_MILLIS_ABBREVIATION, " +
            "сливочного масла – ${resultList[2]}$GRAM_ABBREVIATION")
}