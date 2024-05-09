package lesson9

fun main() {
    println("Введите 5 ингридиентов, разделяя их запятыми с пробелом:")
    readln().split(", ").sorted().forEach{ println(it) }
}