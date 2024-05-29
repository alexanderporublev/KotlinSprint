package lesson19

enum class BulletType(val damage: Int) { Red(20), Blue(5), Green(10) }

class Tank(
    gunType: BulletType? = null,
) {
    private var currentGunType: BulletType? = gunType

    fun changeGun(newGun: BulletType) {
        currentGunType = newGun
    }

    fun shut() = currentGunType?.let {
        println("Наношу урон ${it.damage}")
    } ?: println("Пушка не заряжена")

}

fun main() {
    val tank = Tank()
    tank.shut()
    tank.changeGun(BulletType.Red)
    tank.shut()
    tank.changeGun(BulletType.Blue)
    tank.shut()
    tank.changeGun(BulletType.Green)
    tank.shut()
}