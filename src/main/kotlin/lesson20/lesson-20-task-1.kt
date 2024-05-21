package lesson20

fun main(){
    val greet: (username: String) -> String = {"С наступающим Новым Годом, $it!"}

    println(greet("Василий"))
}