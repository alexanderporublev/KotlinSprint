package lesson16

class Player(
    val name: String,
    private var health: Int,
    private var power: Int,
) {
    fun giveDamage(damageValue: Int) {
        health = Math.max(0, health - damageValue)
        if (health == 0) death()
    }

    fun cure(cureValue: Int) {
        if (health > 0) health += cureValue
    }

    private fun death() {
        health = 0
        power = 0
    }
}

fun main() {
    val player = Player("player", 100, 10)
    player.giveDamage(40)
    player.cure(20)
    player.giveDamage(35)
    player.cure(20)
    player.giveDamage(45)
    player.cure(10)
    player.giveDamage(40)
}