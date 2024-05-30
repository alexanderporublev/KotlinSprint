package lesson21

class Player(
    val name: String,
    val maxHealth: Int,
){
    var currentHealth = maxHealth
}

fun Player.isHealthy(): Boolean = currentHealth == maxHealth

fun main(){
    val player = Player("Вася", 100)
    println("Полностью здоров: ${player.isHealthy()}")
    player.currentHealth -= 30
    println("Полностью здоров: ${player.isHealthy()}")

}