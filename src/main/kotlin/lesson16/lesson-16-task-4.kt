package lesson16

class Order(
    val orderNumber: String,
    private var status: String = "CREATED",
) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun getStatus(): String = status

    fun askManagerToChangeOrderStatus(newStatus: String) = changeStatus(newStatus)
}

fun main() {
    val order = Order("123456789")
    println("Заказ №${order.orderNumber} статус:${order.getStatus()}")
    order.askManagerToChangeOrderStatus("PROCESSING")
    println("Заказ №${order.orderNumber} статус:${order.getStatus()}")
}