package lesson20

class Player(
    val name: String,
    var haveKey: Boolean = false,
)

fun main(){
    val checkKey = {player: Player ->
        if (player.haveKey)
            println("Дверь открытв")
        else
            println("Дверь заперта")
    }

    val player = Player("Вася")
    checkKey(player)
    player.haveKey = true
    checkKey(player)
}