package lesson18

abstract class AbstractOrder(
    val orderNumber: String,
) {
    abstract fun printOrder()
}

class SingleOrder(
    orderNumber: String,
    val good: String,
) : AbstractOrder(orderNumber) {
    override fun printOrder() = println("Заказан товар: $good")
}

class MultiOrder(
    orderNumber: String,
    val goods: List<String>,
) : AbstractOrder(orderNumber) {
    override fun printOrder() = println("Заказан товар: ${goods.joinToString()}")
}

fun createOrder(orderNumber: String, good: String): AbstractOrder = SingleOrder(orderNumber, good)

fun createOrder(orderNumber: String, goods: List<String>): AbstractOrder = MultiOrder(orderNumber, goods)

fun main() {
    createOrder("1234", "Сосиски").printOrder()
    createOrder("9999", listOf("бритва", "ножницы", "шампунь")).printOrder()
}