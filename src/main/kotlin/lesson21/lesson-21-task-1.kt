package lesson21

val vowels = setOf('a', 'e', 'o', 'u', 'i')

fun String.vowelsCount(): Int = this.count { it in vowels }

fun main(){
    println("hello".vowelsCount())
    println("peperoni".vowelsCount())
}