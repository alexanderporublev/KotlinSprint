package lesson16

class Order(
    val orderNumber: String,
    private var status: String = "CREATED",
) {
    fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun getStatus(): String = status
}

fun main() {
    val order = Order("123456789")
    println("Заказ №${order.orderNumber} статус:${order.getStatus()}")
    order.changeStatus("PROCESSING")
    println("Заказ №${order.orderNumber} статус:${order.getStatus()}")
}