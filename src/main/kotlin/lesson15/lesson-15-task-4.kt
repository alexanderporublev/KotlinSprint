package lesson15

interface Searchable{
    fun search(template: String, list: List<Good>): List<Good>
}

abstract class Good(
    val name: String,
    val amount: Int,
)

class MusicalInstrument(
    name: String,
    amount: Int,
) : Good(name, amount), Searchable {
    override fun search(template: String, list: List<Good>): List<Good> {
        println("Выполняется поиск")
        return list.filter{it.name.contains(template)}
    }
}

class MusicalComponent(
    name: String,
    amount: Int,
) : Good(name, amount)

fun main() {
    val goods = listOf(
        MusicalInstrument("Рояль",1,),
        MusicalInstrument("Гитара",5,),
        MusicalComponent("Струны", 8,),
        MusicalComponent("Струны серебряные", 12),
    )

    (goods[1] as MusicalInstrument).search("рун", goods).forEach{println(it.name)}
}