package lesson20

class Player1(
    val name: String,
    val maxHealth: Int,
){
    var currentHealth = maxHealth
}

fun main(){
    val repair: (player: Player1, repairValue: Int) -> Unit = {player, repairValue -> player.currentHealth = Math.min(player.maxHealth, player.currentHealth + repairValue) }

    val player = Player1("Вася", 100)
    player.currentHealth = 30
    repair(player, 40)
    println("${player.name}: ${player.currentHealth}")
    repair(player, 40)
    println("${player.name}: ${player.currentHealth}")
}