package lesson7

fun main() {
    println("Введите число:")
    val number = readln().toInt()
    for(i in (2 ..number step  2 ))
        println(i)
}