package lesson4

fun main() {
    val minimalStaffAmount = 55
    val normalStaffAmount = 70
    val minimalResourceAmount = 50

    val approveAnswer = "д"
    val declineAnswer = "н"

    val approveMessage = "При данных условиях корабль может выйти в море."
    val declineMessage = "При данных условиях корабль не может выйти в море."

    print("Имеет ли корабль повреждения? [$approveAnswer/$declineAnswer]: ")
    val hasMalfunction = readln() == approveAnswer
    println()

    print("Введите количество членов экипажа: ")
    val staffAmount = readln().toInt()
    println()

    print("Введите количество ящиков провизии: ")
    val resourceAmount = readln().toInt()
    println()

    print("Благоприятна ли подода? [$approveAnswer/$declineAnswer]: ")
    val weatherIsComfort = readln() == approveAnswer
    println()

    val approved =      (resourceAmount >= minimalResourceAmount)
                     && (
                            (!hasMalfunction && staffAmount >= minimalStaffAmount && staffAmount <= normalStaffAmount)
                         || (weatherIsComfort && staffAmount == normalStaffAmount)
                        )

    println(if (approved) approveMessage else declineMessage )
}