package lesson4

const val MINIMAL_STAFF_AMOUNT = 55
const val NORMAL_STAFF_AMOUNT = 70
const val MINIMAL_RESOURCE_AMOUNT = 50

const val APPROVE_ANSWER = "д"
const val DECLINE_ANSWER = "н"

fun main() {
    val approveMessage = "При данных условиях корабль может выйти в море."
    val declineMessage = "При данных условиях корабль не может выйти в море."

    print("Имеет ли корабль повреждения? [$APPROVE_ANSWER/$DECLINE_ANSWER]: ")
    val hasMalfunction = readln() == APPROVE_ANSWER
    println()

    print("Введите количество членов экипажа: ")
    val staffAmount = readln().toInt()
    println()

    print("Введите количество ящиков провизии: ")
    val resourceAmount = readln().toInt()
    println()

    print("Благоприятна ли подода? [$APPROVE_ANSWER/$DECLINE_ANSWER]: ")
    val weatherIsComfort = readln() == APPROVE_ANSWER
    println()
    val firstVariant = resourceAmount > MINIMAL_RESOURCE_AMOUNT && !hasMalfunction && staffAmount >= MINIMAL_STAFF_AMOUNT && staffAmount <= NORMAL_STAFF_AMOUNT
    val secondVariant = resourceAmount >= MINIMAL_RESOURCE_AMOUNT && hasMalfunction && weatherIsComfort && staffAmount == NORMAL_STAFF_AMOUNT
    val approved =  firstVariant || secondVariant

    println(if (approved) approveMessage else declineMessage )
}