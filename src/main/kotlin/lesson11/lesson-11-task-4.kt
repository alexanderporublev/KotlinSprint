package lesson11

class Ingredient(
    val name: String,
    val amount: Double,
    val measureUnit: String,
) {
    companion object {
        const val MEASURE_GRAMM = "Г"
        const val MEASURE_ITEMS = "ШТУКИ"
        const val MEASURE_BIG_SPOON = "С. ЛОЖЕК"
        const val MEASURE_LITTLE_SPOON = "Ч. ЛОЖЕК"
    }
}

class Receipt(
    val name: String,
    val ingredients: List<Ingredient>,
)

class Category(
    val name: String,
    val description: String,
    val receipts: MutableList<Receipt>,
    ) {
    fun addReceipt(receipt: Receipt) = receipts.add(receipt)
}